package com.joysistvi.day28enums;

// Class is a blueprint where object is created.
public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static void main(String[] args) {
        // Accessing an enum values
        //System.out.println(Day.MONDAY);

            Day day = Day.THURSDAY;

            // Enum is switch statement

        switch (day) {
            case MONDAY -> System.out.println(Day.MONDAY);
            case TUESDAY -> System.out.println(Day.TUESDAY);
            case WEDNESDAY -> System.out.println(Day.TUESDAY);
            case THURSDAY -> System.out.println(Day.TUESDAY);
            case FRIDAY -> System.out.println(Day.TUESDAY);
            case SATURDAY -> System.out.println(Day.TUESDAY);
            case SUNDAY -> System.out.println(Day.TUESDAY);
        }

        // Loop through an enum
        System.out.println("Loop through an enum: \n");
        for (Day d: Day.values()) {
            System.out.println(d);
        }

        }
    }
