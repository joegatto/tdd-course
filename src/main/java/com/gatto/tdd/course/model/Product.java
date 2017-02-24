package com.gatto.tdd.course.model;

public class Product {

    private String description;
    private int quantity;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Product(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return this.price * this.quantity;
    }

}
