package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Madelo {

    static final int MIN_SUBJECTS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         Average Calculator");
        System.out.println("====================================");

        // Number of students
        int numStudents;
        do {
            System.out.print("Enter number of students: ");
            numStudents = Integer.parseInt(sc.nextLine().trim());
            if (numStudents < 1) {
                System.out.println("Enter at least 1 student.");
            }
        } while (numStudents < 1);

        // Number of subjects (minimum 5)
        int numSubjects;
        do {
            System.out.print("Enter number of subjects: ");
            numSubjects = Integer.parseInt(sc.nextLine().trim());
            if (numSubjects < MIN_SUBJECTS) {
                System.out.println("Enter at least " + MIN_SUBJECTS + " subjects.");
            }
        } while (numSubjects < MIN_SUBJECTS);

        String[] subjects = new String[numSubjects];
        String[] students = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        // Subject names
        System.out.println("\nEnter subject names:");
        for (int j = 0; j < numSubjects; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjects[j] = sc.nextLine().trim();
        }

        // Student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            students[i] = sc.nextLine().trim();

            System.out.println("Enter grades for each subject:");
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = Double.parseDouble(sc.nextLine().trim());
                sum += grades[i][j];
            }
            averages[i] = sum / numSubjects;
        }

        // Grades report
        int lineWidth = 20 + (numSubjects * 12) + 10;
        String line = "-".repeat(lineWidth);

        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("         Grades Report");
        System.out.println("====================================");

        System.out.printf("%-20s", "Student");
        for (int j = 0; j < numSubjects; j++) {
            System.out.printf("%-12s", subjects[j]);
        }
        System.out.printf("%-10s%n", "Average");
        System.out.println(line);

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-20s", students[i]);
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
            }
            System.out.printf("%-10.2f%n", averages[i]);
        }

        sc.close();
    }




}
