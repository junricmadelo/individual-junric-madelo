package com.joysistvi.day9.looping;

import java.util.Scanner;

public class Activity6_Madelo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int number = scanner.nextInt();

        System.out.println();
        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
