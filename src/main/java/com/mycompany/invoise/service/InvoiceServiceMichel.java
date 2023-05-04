package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface{

    private InvoiceRepositoryInterface invoiceRipository;

    private static long lastNumber = 112L;

    public  void createInvoice(Invoice invoice){

invoice.setNumber(String.valueOf(++lastNumber));

invoiceRipository.create(invoice);



    }


}