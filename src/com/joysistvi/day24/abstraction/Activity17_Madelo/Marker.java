package com.joysistvi.day24.abstraction.Activity17_Madelo;

public class Marker extends Pen implements Refillable {

    private boolean permanent;

    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        return "Type: Marker\n" +
                super.toString() + "\n" +
                "Permanent: " + (permanent ? "Yes" : "No");
    }
}