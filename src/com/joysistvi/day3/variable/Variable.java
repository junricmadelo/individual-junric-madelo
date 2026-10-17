package com.joysistvi.day3.variable;

public class Variable {

    // psvm + tab
    public static void main(String[] args) { //
        // iniatialize a variable
        byte age = 26;
        short num = 500;
        int num2 = 50_000;
        long num3 = 1000000000L;
        System.out.println(num3);
        //System.out.println(age);


        float average = 90.90f;
        double price = 10.555555d;
        //System.out.println(price);


        boolean is_active = false;
        is_active = true;
        System.out.println(is_active);


        char middleInitial = 'M';
        //System.out.print(middleInitial);


        String firstName = "Junric";
        String lastName = "Madelo";



        System.out.print("Full Name: " + lastName + ", " + firstName + " " + middleInitial + ".");
        // Concanetation (+) -> joining strings
        // Full Name: Madelo, Junric M.












    }
}