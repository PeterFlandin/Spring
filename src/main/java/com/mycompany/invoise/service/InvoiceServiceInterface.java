package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import org.springframework.stereotype.Service;

@Service
public interface InvoiceServiceInterface {


    void createInvoice(Invoice invoice);

}
