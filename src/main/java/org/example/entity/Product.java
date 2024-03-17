package org.example.entity;

public class Product {

    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    @Override
    public String toString() {
        return this.title + " " + this.price + " " + this.description + " " + this.category + " " + this.image;
    }
}
