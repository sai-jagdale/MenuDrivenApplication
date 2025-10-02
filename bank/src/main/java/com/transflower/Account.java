package com.transflower;


public class Account {
    public String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountType;
    private int phoneNumber;

    public Account(String accountNumber, double initialBalance, String accountHolderName, String accountType, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountType() {
        return accountType;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public class SavingsAccount extends Account {
        private double interestRate;

        public SavingsAccount(String accountNumber, double initialBalance, String accountHolderName, int phoneNumber, double interestRate) {
            super(accountNumber, initialBalance, accountHolderName, "Savings", phoneNumber);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }

    public class CurrentAccount extends Account {
        private double overdraftLimit;

        public CurrentAccount(String accountNumber, double initialBalance, String accountHolderName, int phoneNumber, double overdraftLimit) {
            super(accountNumber, initialBalance, accountHolderName, "Current", phoneNumber);
            this.overdraftLimit = overdraftLimit;
        }

        public double getOverdraftLimit() {
            return overdraftLimit;
        }
    }

    public class FixedDepositAccount extends Account {
        private int depositTerm; // in months

        public FixedDepositAccount(String accountNumber, double initialBalance, String accountHolderName, int phoneNumber, int depositTerm) {
            super(accountNumber, initialBalance, accountHolderName, "Fixed Deposit", phoneNumber);
            this.depositTerm = depositTerm;
        }

        public int getDepositTerm() {
            return depositTerm;
        }
    }

}

