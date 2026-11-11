package com.joysistvi.day24.abstraction.Activity17_Madelo;

public abstract class Pen {

    private String brand;
    private String color;
    private double weightInGrams;


    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }


    public abstract void write();


    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

    // Overloaded methods (not override sa mga child class)
    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Weight in Grams: " + weightInGrams;
    }
}
