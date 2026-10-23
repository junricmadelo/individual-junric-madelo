package com.joysistvi.day9.looping.dowhileloop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoopStatement {

    public static void main (String[] args ) {
        int  i = 0;
        String color = "Black";
        do {
            System.out.println(color);
        }
        while (color == "White");  {

        }


        Scanner scanner = new Scanner(System.in);
        // Flag variable / boolean flag
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("* Load Reg *");
            System.out.println("    [1] Text Only!");
            System.out.println("    [2] Call Only!");
            System.out.println("    [3] Call N Text!");
            System.out.println(" Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1 -> System.out.println("You are now subscribe to Text Only!\n");
                case 2 -> System.out.println("You are now subscribe to Call Only!\n");
                case 3 -> System.out.println("You are now subscribe to Call N Text!\n");
                default -> System.out.println("Invalid Input!\n");
            }



        }

    }
}

