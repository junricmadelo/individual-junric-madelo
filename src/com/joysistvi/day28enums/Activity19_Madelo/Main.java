package com.joysistvi.day28enums.Activity19_Madelo;

public class Main {

    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("1001", "Juan Dela Cruz", 5000.0);
        CheckingAccount checking = new CheckingAccount("2001", "Maria Santos", 1000.0);

        System.out.println("=== Savings Account ===");
        testAccount(savings);

        System.out.println("\n=== Checking Account ===");
        testAccount(checking);

        System.out.println("\n=== Savings Transactions ===");
        savings.deposit(1000);
        savings.withdraw(5800);
        savings.deposit(500, "Birthday gift");
        savings.withdraw(1500, "Rent");

        System.out.println("\n=== Checking Transactions ===");
        checking.withdraw(2500);
        checking.withdraw(1000);

        System.out.println("\n=== Transfer (Savings to Checking) ===");
        savings.transfer(checking, 1000);

        System.out.println("\n=== Interest ===");
        savings.addInterest();
    }

}
