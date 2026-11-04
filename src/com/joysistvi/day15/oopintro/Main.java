package com.joysistvi.day15.oopintro;

public class Main {

    public static void main(String[] args) {

        // Class Instantiation / Create an object  of a class
        Laptop laptop = new Laptop();
        System.out.println(laptop.brand);

        laptop.brand = "Apple";
        laptop.color = "Gray";
        laptop.weightInKg = 1.5;
        laptop.cpu = "ios";
        laptop.ramInGb = 16;

        laptop.browseInternet();
        laptop.createDocuments();
        laptop.sendMessages();
        laptop.transferFiles();

        Laptop laptop2 = new Laptop();
        laptop.brand = "Acer";
        laptop.color = "Black";
        laptop.weightInKg = 1;
        laptop.cpu = "Ryzen";
        laptop.ramInGb = 16;


        laptop2.sendMessages();
        laptop2.transferFiles();
        laptop2.createDocuments();



        Laptop laptop3 = new Laptop();
        laptop3.brand  = "Azus";
        laptop3.color = "White";
        laptop3.cpu = "Ryzen 10";
        laptop3.ramInGb = 32;
        laptop3.weightInKg =  2;

        laptop3.createDocuments();
        laptop3.transferFiles();
        laptop3.browseInternet();


    }
}

