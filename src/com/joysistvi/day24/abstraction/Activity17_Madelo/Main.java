package com.joysistvi.day24.abstraction.Activity17_Madelo;

import com.joysistvi.day23.polymorphism.Activity16_Madelo.Ballpen;
import com.joysistvi.day23.polymorphism.Activity16_Madelo.Marker;
import com.joysistvi.day23.polymorphism.Activity16_Madelo.Pen;

public class Main {

    public static void main(String[] args) {

        // Part 3: three objects use a Pen reference


        Pen pen1 = new Pen("Pilot", "Black", 10);
        Pen pen2 = new Ballpen("Pilot", "Black", 15, 1.5);
        Pen pen3 = new Marker("Stabilo", "Green", 30, true);

        System.out.println("= Calling methods on Pen references =");

        System.out.println("*** Pen ***");
        pen1.write();
        pen1.refill();
        System.out.println();

        System.out.println("*** Ballpen ***");
        pen2.write();
        pen2.refill();
        System.out.println();

        System.out.println("*** Marker ***");
        pen3.write();
        pen3.refill();
        System.out.println();

        System.out.println("*** testPen() ***");
        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        // Part 4: overloading gamit ang Pen reference na may hawak or under ng child object

        System.out.println("*** Overloading ***");
        pen3.write("Hello");
        pen3.write("Hello", 3);
    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
        System.out.println();
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

