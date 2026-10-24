package com.joysistvi.day10;

public class Activity7_Madelo {

    public static void main(String[] args) {
        for (int table = 1; table <= 10; table++) {
            System.out.println("Multiplication Table of " + table);

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
            }

            System.out.println();
        }
    }

}
