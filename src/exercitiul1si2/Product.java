package exercitiul1si2;

import java.time.LocalDateTime;

public class Product {
    private Double price;
    private String name;
    private String description;
    private Integer quantity;
    private LocalDateTime dateAdded;

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public Integer getQuantity() {
        return quantity;

    }

    public Product(Double price, String name, String description, Integer quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.dateAdded = dateAdded;


    }

}
