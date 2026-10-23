package com.joysistvi.day7.ifstatement;

public class IfElseLadderStatement {

    public static void main(String[] args) {
        //



        int grade = 80 ;
        String result;

        if (!(grade >= 1 && grade <= 100)) {
            return;
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);







    }

}

/*
        int day = 4;
        String dayName;

        if (day == 1) {
            // Execute when the day is  1
            dayName = "Sunday";
        } else if (day == 2) {
            // Execute when the day is  2
            dayName = "Monday";
        } else if (day == 3) {
            // Execute when the day is  3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Execute when the day is  4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Execute when the day is  5
            dayName = "Thursday";
        } else if (day == 6) {
            // Execute when the day is  6
            dayName = "Friday";
        } else if (day == 7) {
            // Execute when the day is  7
            dayName = "Saturday";
        } else {
            // Execute when the day is  Invalid
            dayName = "Invalid Day";
        }

        System.out.println(dayName);
    }
 */