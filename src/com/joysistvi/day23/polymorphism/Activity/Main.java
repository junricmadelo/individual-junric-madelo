package com.joysistvi.day23.polymorphism.Activity;

public class Main {

    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Pilot", "Black", 20, 1);
        Marker marker = new Marker("Pentel", "Red", 35, true);

        System.out.println("=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println();

        System.out.println("=== Marker ===");
        System.out.println(marker);
        marker.write();
    }
}






















/*
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 3);
        Cat cat = new Cat("Mingming", 2, "White");
        Dog dog = new Dog("Bantay", 3, "Aspin");

        System.out.println("=== Animal ===");
        System.out.println(animal);
        animal.eat();
        animal.makeSound();

        System.out.println("\n=== Dog ===");
        System.out.println(dog);
        dog.eat(); // inherited from animal
        dog.makeSound(); // overriden in dog
        dog.fetch(); // only Dog has this

        System.out.println("\n=== Cat ===");
        System.out.println(cat);
        cat.eat(); // inherited from Animal
        cat.makeSound(); // overriden in Cat
        cat.scratch(); // only Cat has this
    }
}
 */

