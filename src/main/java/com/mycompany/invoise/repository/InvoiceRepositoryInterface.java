package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepositoryInterface {

    void create (Invoice invoice);

}
