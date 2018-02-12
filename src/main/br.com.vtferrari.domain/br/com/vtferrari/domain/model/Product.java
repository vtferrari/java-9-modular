package br.com.vtferrari.domain.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Product {
    private String name;
    private LocalDateTime date;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, LocalDateTime date, BigDecimal price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
