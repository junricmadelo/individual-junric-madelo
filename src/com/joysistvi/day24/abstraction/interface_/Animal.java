package com.joysistvi.day24.abstraction.interface_;


// Parent / Super Class
public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // non -abstract method / regular method: shared by all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // abstract metho: every child class MUST implement them
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + age;
    }
}

