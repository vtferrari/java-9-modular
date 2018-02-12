package br.com.vtferrari.integration.service;


import br.com.vtferrari.integration.model.Invoice;
import br.com.vtferrari.integration.ws.InvoiceSubscribe;

import java.math.BigDecimal;
import java.util.concurrent.SubmissionPublisher;


public class TransmitInvoice {

    private SubmissionPublisher<Invoice> publisher;

    public TransmitInvoice() {
        publisher = new SubmissionPublisher<>();
        publisher.subscribe(new InvoiceSubscribe());
    }

    public void emit(String clientName, BigDecimal price) {


        final Invoice invoice = new Invoice(clientName, price);
        publisher.submit(invoice);
    }

    public void close() {
        this.publisher.close();
    }


}
