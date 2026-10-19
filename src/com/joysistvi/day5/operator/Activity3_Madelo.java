package com.joysistvi.day5.operator;

public class Activity3_Madelo {

    public static void main(String[] args) {

        // Task 2: Logical AND (&&)
        int age = 20;
        boolean hasValidID = true;

        System.out.println("--- Task 2: Event Entry Check ---");
        boolean canEnter = (age >= 18) && hasValidID;
        System.out.println("Allowed to enter the event: " + (canEnter ? "Yes" : "No"));

        // Task 3: Logical OR (||)
        boolean isWeekend = true;
        boolean isHoliday = false;

        System.out.println("\n--- Task 3: Class Status Check ---");
        boolean noClasses = isWeekend || isHoliday;
        if (noClasses) {
            System.out.println("Are there no classes today? Yes, no classes.");
        } else {
            System.out.println("Are there no classes today? No, there are classes.");
        }

        // Task 4: Ternary operator (pass or fail)
        int score = 85;

        System.out.println("\n--- Task 4: Pass or Fail Check ---");
        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);

        // Task 5: Ternary operator (larger number)
        int num = 75;
        int num2 = 90;

        System.out.println("\n--- Task 5: Larger Number Check ---");
        int larger = (num > num2) ? num : num2;
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + larger);
    }
}

