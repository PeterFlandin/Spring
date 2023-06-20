package com.mycompany.invoise.controller.douchette;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private final InvoiceServiceInterface invoiceService;

    public InvoiceControllerDouchette(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    @Override
    public void createInvoice() {
        System.out.println("Usage of scnner");
        Invoice invoice = new Invoice();
   invoice.setCustomerName("galactique");
invoiceService.createInvoice(invoice);


    }
}
