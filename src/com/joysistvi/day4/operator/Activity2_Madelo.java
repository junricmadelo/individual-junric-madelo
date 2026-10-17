package com.joysistvi.day4.operator;

public class Activity2_Madelo {
    public static void main(String[] args) {

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;


        System.out.println("*** Expense Tracker Program ***");
        System.out.printf("Income: %.0f%n", income);

        // Percentage kada expense relative to income
        double foodPercent = (foodAllowance / income) * 100;
        System.out.printf("Food Allowance: %.1f %%%n", foodPercent);


        double transportPercent = (transportation / income) * 100;
        System.out.printf("Transportation: %.1f %%%n", transportPercent);


        double rentPercent = (rent / income) * 100;
        System.out.printf("Rent: %.1f %%%n", rentPercent);



        double utilityPercent = (utilityBill / income) * 100;
        System.out.printf("Utility Bill: %.1f %%%n", utilityPercent);




        // Remaining balance para sa lahat ng expenses
        double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill);
        System.out.printf("Remaining Balance: %.0f%n", remainingBalance);


    }

}
