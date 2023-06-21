package com.mycompany.invoise.core.service.number;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

import java.util.List;

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

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }


}
