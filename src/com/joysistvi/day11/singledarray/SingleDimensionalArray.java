package com.joysistvi.day11.singledarray;

public class SingleDimensionalArray {

    public static void main (String [] args) {
        // syntax
        // age 24, 26. 30, 38, 17


        int[] ages  = { 24, 26, 30, 38, 17, 50, 60 } ;

        // invoke an element
        //System.out.println(age[5]);


        // get the length of an array
        for(int i = 0; i < ages.length; i++) {
            if (i == 5) {
                break;
            }
        for (int age: ages) {
            System.out.println(age);

        }

        }
    }
}
