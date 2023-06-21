package com.mycompany.invoise.core.repository.database;

import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create (Invoice invoice){

    /* PreparedStatement pstmt =  connexion.prepareStatement("INSERT INTO facture(NUMBER , CUSTOMERNAME) VALUES(?,?)");
pstmt.executeUpdate(); */
        System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());

    }

    @Override
    public List<Invoice> list() {
        Invoice invoiceOne = new Invoice();
        invoiceOne.setNumber("NUM_1");
        invoiceOne.setCustomerName("EDF");
        Invoice invoiceTow = new Invoice();
        invoiceTow.setNumber("NUM_2");
        invoiceTow.setCustomerName("lA POSTE");
        return List.of(invoiceOne, invoiceTow);
    }

}