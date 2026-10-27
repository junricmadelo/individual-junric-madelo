package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8_Madelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + (i + 1) + ": " + numbers[i]);
        }

        double average = (double) sum / numbers.length;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Stretch goal
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        input.close();

    }

        
}
