package com.transflower;

public class App 
{
    public static void main( String[] args )
    {
        UIManager uiManager = new UIManager();
        ProductManager productManager = new ProductManager();   
        int choice;
        do {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. List Product");
            System.out.println("5. List All Products");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = uiManager.getChoice();
            switch (choice) {
                case 1:
                    Product productToAdd = uiManager.accept();
                    productManager.addProduct(productToAdd);
                    break;
                case 2:
                    int productIdToRemove = uiManager.acceptId();
                    productManager.removeProduct(productIdToRemove);
                    break;
                case 3:
                    Product productToUpdate = uiManager.accept();
                    productManager.updateProduct(productToUpdate);
                    break;
                case 4:
                    int productIdToList = uiManager.acceptId();
                    Product product = productManager.listProduct(productIdToList);
                        if (product != null) {
                            uiManager.display(product);
                        } else {
                            System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    uiManager.displayAll(productManager.listAllProducts());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}
