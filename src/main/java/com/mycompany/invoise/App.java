package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerChambouleTout;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRipository;
import com.mycompany.invoise.repository.InvoiceRipositoryMichel;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dans quel configuration etes vous ?");
        int configuration = sc.nextInt();
        if(configuration == 1) {
            InvoiceController invoiceController = new InvoiceController();

           InvoiceService invoiceService = new InvoiceService();
           invoiceController.setInvoiceService(invoiceService);
            InvoiceRipository invoiceRipository = new InvoiceRipository();
invoiceService.setInvoiceRepository(invoiceRipository);


            invoiceController.createInvoice();

        } else if(configuration == 2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();

           InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
invoiceControllerMichel.setInvoiceService(invoiceServiceMichel);
            InvoiceRipositoryMichel invoiceRipositoryMichel = new InvoiceRipositoryMichel();
invoiceServiceMichel.setInvoiceRipository(invoiceRipositoryMichel);
            invoiceControllerMichel.createInvoice();
        } else if(configuration == 3) {


            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();

            InvoiceService invoiceService = new InvoiceService();

            invoiceControllerMichel.setInvoiceService(invoiceService);
            InvoiceRipositoryMichel invoiceRipositoryMichel = new InvoiceRipositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRipositoryMichel);
            invoiceControllerMichel.createInvoice();

        } else if(configuration == 4) {

            InvoiceControllerChambouleTout invoiceControllerChambouleTout = new InvoiceControllerChambouleTout();

            InvoiceService invoiceService = new InvoiceService();
            invoiceControllerChambouleTout.setInvoiceService(invoiceService);
            InvoiceRipositoryMichel invoiceRipositoryMichel = new InvoiceRipositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRipositoryMichel);
            invoiceControllerChambouleTout.createInvoice();



        }
    }





}
