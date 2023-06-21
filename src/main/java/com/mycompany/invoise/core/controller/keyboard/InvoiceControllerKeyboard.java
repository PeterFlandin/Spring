package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;
//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    public InvoiceControllerKeyboard(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private final InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void createInvoice() {
    System.out.println( "Quel nom du client ?" );
    Scanner sc = new Scanner(System.in);
    String consumerName =  sc.nextLine();
    Invoice invoice = new Invoice();
    invoice.setCustomerName(consumerName);

    invoiceService.createInvoice(invoice);
}



}
