package com.joysistvi.day27.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapCrud {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(2026001, "Junric");
        students.put(2026002, "John");
        students.put(2026002, "June");

        System.out.println("Student 2026002: " + students.get(2026002));

        students.put(2026002,"Cedrick Manito");
        System.out.println("Updated 2026002: " + students.get(2026002));

        int searchId = 2026001;
        if (students.containsKey(searchId)) {
            System.out.println(searchId + " is enrolled");
        } else {
            System.out.println(searchId + " is not found");
        }

        students.remove(2026003);

        System.out.println("\nEnrolled Student List: ");
        for (int id : students.keySet()) {
            System.out.println(id + " - " + students.get(id));
        }









    }
}
