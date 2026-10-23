package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*
    // syntax

        for (int i = 1; i <= 3; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
 */

/*
    public static void main (String []args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //
            for (int j = 1; j <= i; j++) {
                System.out.println("\t" + j);
            }
        }

    }
 */