package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface  {

private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
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
