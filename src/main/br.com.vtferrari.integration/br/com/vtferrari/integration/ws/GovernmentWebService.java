package br.com.vtferrari.integration.ws;

import br.com.vtferrari.integration.model.Invoice;

public class GovernmentWebService {

    public static void emit(Invoice invoice) {
        try {
            System.out.println("emitindo...");
            Thread.sleep(5000);
            System.out.println("emitido!");
        } catch (Exception e) {
            System.out.println("falha ao emitir a nf");
        }
    }
}
