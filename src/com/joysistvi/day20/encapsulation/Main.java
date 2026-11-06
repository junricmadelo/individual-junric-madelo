package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount user = new UserAccount();

        System.out.println("**********************************");
        System.out.println("*     User Account Registration  *");
        System.out.println("**********************************");
        System.out.println();

        prompt(scanner, "Enter First Name: ", user::setFirstName);
        prompt(scanner, "Enter Middle Name: ", user::setMiddleName);
        prompt(scanner, "Enter Last Name: ", user::setLastName);
        prompt(scanner, "Enter Address: ", user::setAddress);
        prompt(scanner, "Enter Email: ", user::setEmail);
        prompt(scanner, "Enter Password: ", user::setPassword);

        System.out.println();
        System.out.println("--- User Account Created ---");
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        scanner.close();
    }

    // Re-prompts until the setter accepts the value.
    private static void prompt(Scanner scanner, String label, Consumer<String> setter) {
        while (true) {
            System.out.print(label);
            String input = scanner.nextLine();
            try {
                setter.accept(input);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }


}
