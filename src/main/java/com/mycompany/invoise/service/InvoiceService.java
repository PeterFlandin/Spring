package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRipository;

public class InvoiceService {

    private InvoiceRipository invoiceRipository = new InvoiceRipository();

    private static long lastNumber = 0L;

    public  void createInvoice(Invoice invoice){

invoice.setNumber(String.valueOf(++lastNumber));

invoiceRipository.create(invoice);



    }



}
