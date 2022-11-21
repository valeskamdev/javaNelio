package aula.product.entities;

import java.time.LocalDate;

public class Order {

    private LocalDate date;
    private Product product;

    public Order(LocalDate date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
