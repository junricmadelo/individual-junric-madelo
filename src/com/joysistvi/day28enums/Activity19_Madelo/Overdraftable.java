package com.joysistvi.day28enums.Activity19_Madelo;

public interface Overdraftable {
    double OVERDRAFT_LIMIT = 2000.0;

    boolean isWithinOverdraft(double amount);
}