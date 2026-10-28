package com.joysistvi.day13.string;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("*** LOGIN ***");

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin123";

        final int MAX_ATTEMPTS = 5;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter Username:");
            String username = scanner.nextLine();

            System.out.println("Enter Password:");
            String password = scanner.nextLine();

            attempts++;
            int remaining = MAX_ATTEMPTS - attempts;

            // Validation
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
                System.out.println("Attempts remaining: " + remaining + "\n");
                continue;
            }

            // Authentication
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                System.out.println("Welcome, " + username + "!");
                return;
            }

            System.out.println("Invalid Username or Password.");
            System.out.println("Attempts remaining: " + remaining + "\n");
        }

        System.out.println("Access Denied. Maximum login attempts reached.");
    }
}






/*

charAt()
      String word = "Hello"; // String literal

        System.out.println(word.charAt(4));

        length ()
                String word = "Hello"; // String literal

        System.out.println(word.length ());



         System.out.println("Are you sure that you really wanna exit");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your choice:");
        String choice = scanner.nextLine();

        if (choice.equals("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Returning Back to Main Menu");

        }
 */