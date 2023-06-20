package com.mycompany.invoise.controller.web;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {
@Autowired
    private final InvoiceServiceInterface invoiceService;

    public InvoiceControllerWeb(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void createInvoice() {


        String consumerName =  "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(consumerName);

        invoiceService.createInvoice(invoice);


    }
@RequestMapping("/invoice-home")
    public @ModelAttribute ("invoiceList") List<Invoice> displayHome(HttpServletRequest request) {
        System.out.println("displayHome");
    List<Invoice> invoiceList = invoiceService.getInvoiceList();
    return invoiceList;
    }

}
