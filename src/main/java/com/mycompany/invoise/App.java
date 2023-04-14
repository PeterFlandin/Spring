package com.mycompany.invoise;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {



        System.out.println( "Quel nom du client ?" );
        Scanner sc = new Scanner(System.in);
      String consumerName =  sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(consumerName);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);

    }





}
