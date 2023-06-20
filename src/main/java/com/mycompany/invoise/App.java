package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.prefix.InvoiceServicePrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@SpringBootApplication

public class App
{
    public static void main( String[] args )
    {

    // ApplicationContext context = new AnnotationConfigApplicationContext(App.class, App.class);

ApplicationContext context = SpringApplication.run(App.class);
  InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

invoiceController.createInvoice();

    }

}
