package com.transflower;

import java.util.Scanner;
import java.util.List;

public class UIManager {

    private static final Scanner scanner = new Scanner(System.in);

    public Product accept() {
        System.out.println("Enter product ID:");
        int product_id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name:");
        String product_name = scanner.nextLine();
        System.out.println("Enter product price:");
        double product_price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product category:");
        String product_category = scanner.nextLine();
        System.out.println("Enter product description:");
        String product_description = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        return new Product(product_id, product_name, product_price, product_category, product_description);
    }

    public int acceptId() {
        System.out.println("Enter product ID:");
        return Integer.parseInt(scanner.nextLine());
    }

    public void display(Product product) {
        System.out.println(
        "product_id = " + product.product_id +
        " | product_name = " + product.product_name +
        " | product_price = " + product.product_price +
        " | product_category = " + product.product_category +
        " | product_description = " + product.product_description
        );
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public void displayAll(List<Product> products) {
        System.out.println("DEBUG: Number of products = " + products.size());
        for (Product product : products) {
            display(product);
        }
    }

    public int getChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter your choice: ");
            }
        }
    }
}