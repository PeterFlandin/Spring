package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

private static List<Invoice> invoices = new ArrayList<>();


    public void create (Invoice invoice){

invoices.add(invoice);
        System.out.println("invoices added " + invoice.getNumber()+ " pour" +invoice.getCustomerName());


    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
