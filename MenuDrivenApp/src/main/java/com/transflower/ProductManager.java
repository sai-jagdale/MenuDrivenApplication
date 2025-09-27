package com.transflower;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products = new ArrayList<>();

    public ProductManager() {
        // Add default products here
        products.add(new Product(1, "Sam", 10.0, "human", "girl"));
        products.add(new Product(2, "Chait", 10.0, "human", "girl"));
        products.add(new Product(3, "Arnav", 50.0, "human", "boy"));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int product_id) {
        products.removeIf(p -> p.product_id == product_id);
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).product_id == product.product_id) {
                products.set(i, product);
                break;
            }
        }
    }

    public Product listProduct(int product_id) {
        for (Product p : products) {
            if (p.product_id == product_id) {
                return p;
            }
        }
        return null;
    }

    public List<Product> listAllProducts() {
        return new ArrayList<>(products);
    }
}