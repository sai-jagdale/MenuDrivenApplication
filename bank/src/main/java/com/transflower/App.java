package com.transflower;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		UIManager ui = new UIManager();
		BankManager bm = new BankManager();
		bm.preLoadData();

		while (true) {
			int choice = ui.menuList();
			switch (choice) {
				case 1:
					Account acc = ui.accept();
					bm.addAccount(acc);
					break;
				case 2:
					String accNum = ui.getAccountNumber();
					Account found = bm.getAccountByNumber(accNum);
					if (found != null) {
						System.out.println(found);
					} else {
						System.out.println("Account not found!");
					}
					break;
				case 3:
					for (Account a : bm.getAllAccounts()) {
						System.out.println(a);
					}
					break;
				case 4:
					String updateNum = ui.getAccountNumber();
					Account updatedAcc = ui.accept();
					bm.updateAccount(updateNum, updatedAcc);
					break;
				case 5:
					String delNum = ui.getAccountNumber();
					bm.deleteAccount(delNum);
					break;
				case 6:
					String balNum = ui.getAccountNumber();
					double amt = ui.getAmount();
					bm.addBalance(balNum, amt);
					break;
				case 7:
					System.out.println("Exiting...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}