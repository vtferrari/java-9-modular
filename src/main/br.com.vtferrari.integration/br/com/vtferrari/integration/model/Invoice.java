package br.com.vtferrari.integration.model;


import java.math.BigDecimal;


public class Invoice {
    private String client;
    private BigDecimal amount;

    public Invoice() {
    }

    public Invoice(String client, BigDecimal amount) {
        this.client = client;
        this.amount = amount;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
