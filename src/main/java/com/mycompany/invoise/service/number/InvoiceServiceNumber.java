package com.mycompany.invoise.service.number;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {


    private static long lastNumber = 0L;
    private final InvoiceRepositoryInterface invoiceRepository;


    public InvoiceServiceNumber(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public  void createInvoice(Invoice invoice){

invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));
        invoiceRepository.create(invoice);

    }



}
