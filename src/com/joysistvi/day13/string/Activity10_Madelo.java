package com.joysistvi.day13.string;

public class Activity10_Madelo {

    public static void main(String[] args) {
        String country = "Philippines";

        // 1. First and last character
        char first = country.charAt(0);
        char last = country.charAt(country.length() - 1);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);

        // 2. Count of P/p
        int pCount = 0;
        for (char c : country.toCharArray()) {
            if (c == 'P' || c == 'p') {
                pCount++;
            }
        }
        System.out.println("Count of P/p: " + pCount);

        // 3. Count of vowels
        int vowelCount = 0;
        for (char c : country.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total vowels: " + vowelCount);
    }
}

