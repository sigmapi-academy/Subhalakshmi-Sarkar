package Inventory_Management_System;

public class Product {
    private String product_id;
    private String name;
    private double price;
    private int quantity;
    private boolean lowStock;

    public Product() {
        this.lowStock = false;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public int compareTo(Product other) {
        return Integer.compare(this.quantity, other.quantity);
    }

}