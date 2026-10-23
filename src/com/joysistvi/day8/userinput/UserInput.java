package com.joysistvi.day8.userinput;

import java.util.Scanner;
public class UserInput {

    public static void main(String[] args){
        // Instantiate Sanner Class/ Create an object  of Scanner
        Scanner scanner =  new Scanner (System.in);

        // Prompt the user for input
        System.out.print(" Enter day number: (1-7): ");

        // Get user input using nextIn() and stores it to variable day
        int day = scanner.nextInt();
        String dayName = "";

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        }

        System.out.println(dayName);
    }
}
