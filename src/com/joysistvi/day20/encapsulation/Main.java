package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

import java.util.function.Consumer;

// Activity 14_Madelo Part 2

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** User Registration ***");
        System.out.println("Please enter the details below:");
        System.out.println();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        UserAccount account = new UserAccount(firstName, middleName, lastName,
                address, email, password);

        System.out.println();
        System.out.println(account);

        scanner.close();
    }


}
