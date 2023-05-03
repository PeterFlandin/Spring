package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRipository;
import com.mycompany.invoise.repository.InvoiceRipositoryMichel;

public class InvoiceServiceMichel {

    private InvoiceRipositoryMichel invoiceRipository = new InvoiceRipositoryMichel();

    private static long lastNumber = 112L;

    public  void createInvoice(Invoice invoice){

invoice.setNumber(String.valueOf(++lastNumber));

invoiceRipository.create(invoice);



    }



}
