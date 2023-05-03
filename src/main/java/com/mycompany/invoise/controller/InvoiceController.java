package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {



public static void createInvoiceUsingConnsole() {
    System.out.println( "Quel nom du client ?" );
    Scanner sc = new Scanner(System.in);
    String consumerName =  sc.nextLine();
    Invoice invoice = new Invoice();
    invoice.setCustomerName(consumerName);

    InvoiceService invoiceService = new InvoiceService();
    invoiceService.createInvoice(invoice);
}


}
