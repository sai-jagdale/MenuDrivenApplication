package com.transflower;

public class Product {
    public int product_id;
    public String product_name;
    public double product_price;
    public String product_category;
    public String product_description;

    public Product(int product_id, String product_name, double product_price, String product_category, String product_description) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_category = product_category;
        this.product_description = product_description;
    }
}