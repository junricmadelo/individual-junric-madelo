package com.joysistvi.day27.program;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create an arrayList to store student objects
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101,"JM","Malabon","09399869544"));
        employeeList.add(new Employee(102,"Ced","Rizal","09399869544"));
        employeeList.add(new Employee(103,"Aljane","Romblon","09399869544"));

        System.out.println("List of Employees: ");

        //System.out.println(employeeList);

    }
}

/*
    ArrayList: get
    LinkedList: add
 */
