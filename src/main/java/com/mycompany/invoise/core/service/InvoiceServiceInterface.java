package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceServiceInterface {


    void createInvoice(Invoice invoice);
    List<Invoice> getInvoiceList();


}
