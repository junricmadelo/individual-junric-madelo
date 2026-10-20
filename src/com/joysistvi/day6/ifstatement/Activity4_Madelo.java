package com.joysistvi.day6.ifstatement;

public class Activity4_Madelo {

    public static void main(String[] args) {
        int age = 28;

        // Validate Age

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            System.exit(0);
        }

        String category;

        // Categorize Age

        if (age <= 2) {
            category = "Baby";
        } else if (age <= 12) {
            category = "Child";
        } else if (age <= 19) {
            category = "Teenager";
        } else if (age <= 29) {
            category = "Young Adult";
        } else if (age <= 59) {
            category = "Adult";
        } else {
            category = "Senior";
        }

        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
    }
}