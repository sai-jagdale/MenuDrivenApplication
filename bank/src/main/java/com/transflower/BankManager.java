package com.transflower;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
	private List<Account> accountList = new ArrayList<>();

	// Preload some accounts
	public void preLoadData() {
		accountList.add(new Account("A001", 10000, "John Doe", "Saving", 1234567890));
		accountList.add(new Account("A002", 20000, "Jane Smith", "Current", 987654321));
		accountList.add(new Account("A003", 5000, "Alice Brown", "Saving", 555555555));
	}

	// Add new account
	public void addAccount(Account acc) {
        accountList.add(acc);
        System.out.println("Adding account: " + acc);
	}

	// Get account by account number
	public Account getAccountByNumber(String accountNumber) {
		for (Account acc : accountList) {
			if (acc.getAccountNumber().equals(accountNumber)) {
				System.out.println("Account found: " + acc);
                return acc;
			}
		}
		return null;
	}

	// Get all accounts
	public List<Account> getAllAccounts() {
		System.out.println("Displaying all accounts...");
        return new ArrayList<>(accountList);
	}

	// Update account using full parameters
	public boolean updateAccount(String accountNumber, String name, String type, int phone) {
		for (Account acc : accountList) {
			if (acc.getAccountNumber().equals(accountNumber)) {
				try {
					java.lang.reflect.Field nameField = Account.class.getDeclaredField("accountHolderName");
					nameField.setAccessible(true);
					nameField.set(acc, name);

					java.lang.reflect.Field typeField = Account.class.getDeclaredField("accountType");
					typeField.setAccessible(true);
					typeField.set(acc, type);

					java.lang.reflect.Field phoneField = Account.class.getDeclaredField("phoneNumber");
					phoneField.setAccessible(true);
					phoneField.set(acc, phone);

					return true;
				} catch (Exception e) {
					// Handle exception silently
				}
			}
		}
		return false;
	}
    // Overloaded method: update using individual parameters    
    public boolean updateAccount(String accountNumber, Account account) {
        return updateAccount(accountNumber, account.getAccountHolderName(), account.getAccountType(), account.getPhoneNumber());
    }

	// Delete account by account number
	public boolean deleteAccount(String accountNumber) {
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				accountList.remove(i);
                System.out.println("Account with account number " + accountNumber + " has been deleted.");
				return true;
			}
		}
		return false;
	}

	// Add balance to an account by account number
	public boolean addBalance(String accountNumber, double amount) {
		for (Account acc : accountList) {
			if (acc.getAccountNumber().equals(accountNumber) && amount > 0) {
				try {
					java.lang.reflect.Field balanceField = Account.class.getDeclaredField("balance");
					balanceField.setAccessible(true);
					double currentBalance = (double) balanceField.get(acc);
					balanceField.set(acc, currentBalance + amount);
					return true;
				} catch (Exception e) {
					// Handle exception silently
				}
			}
		}
		return false;
	}
}