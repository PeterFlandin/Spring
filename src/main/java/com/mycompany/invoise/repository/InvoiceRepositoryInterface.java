package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepositoryInterface {

    void create (Invoice invoice);
    List<Invoice> list();

}
