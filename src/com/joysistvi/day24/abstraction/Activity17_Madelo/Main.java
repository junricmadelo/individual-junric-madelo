package com.joysistvi.day24.abstraction.Activity17_Madelo;

public class Main {

    public static void main(String[] args) {


        Ballpen ballpen = new Ballpen("Pilot", "Black", 20, 1.0);
        Marker marker = new Marker("Pentel", "Red", 35, true);

        System.out.println("=== testPen() ===");
        testPen(ballpen);
        testPen(marker);

        System.out.println("=== testRefillable() ===");
        testRefillable(ballpen);
        testRefillable(marker);

        System.out.println("=== testClickable() ===");
        testClickable(ballpen);

    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
        System.out.println();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
        System.out.println();
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }
}

/*
 * Takeaway:
 * An abstract class (extends) is a partial blueprint. It can hold fields, a constructor,
 * and regular methods, and a class can extend only one of them (an "is-a" relationship).
 * An interface (implements) is a contract of abilities. It holds constants and methods
 * with no body, and a class can implement many of them (a "can-do" relationship).
 * Pen is what Ballpen and Marker are. Refillable and Clickable are what they can do.
 */


