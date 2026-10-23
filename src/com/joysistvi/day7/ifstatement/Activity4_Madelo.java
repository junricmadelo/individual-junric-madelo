package com.joysistvi.day7.ifstatement;

public class Activity4_Madelo {

    public static void main(String[] args) {
        int age = 28;

        //Age: 0 - 2 → Baby
        //Age: 3 - 12 → Child
        //Age: 13 - 19 → Teenager
        //Age: 20 - 29 → Young Adult
        //Age: 30 - 59 → Adult
        //Age: 60 - 100 → Senior

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