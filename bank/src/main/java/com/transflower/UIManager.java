
package com.transflower;

import java.util.Scanner;

public class UIManager {

    private Scanner sc = new Scanner(System.in);

    public int menuList() {
        System.out.println("\n---- MENU ----");
        System.out.println("1. Add Account");
        System.out.println("2. Display Account by Number");
        System.out.println("3. Display All Accounts");
        System.out.println("4. Update Account");
        System.out.println("5. Delete Account");
        System.out.println("6. Add Balance");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public Account accept() {
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.next();
        sc.nextLine(); // consume newline
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        int phone = sc.nextInt();
        sc.nextLine(); // consume newline

        return new Account(accountNumber, balance, name, type, phone);
    }

    public String getAccountNumber() {
        System.out.print("Enter Account Number: ");
        return sc.next();
    }

    public double getAmount() {
        System.out.print("Enter Amount: ");
        return sc.nextDouble();
    }
}
