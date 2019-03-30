package com.tipizo.introclasses;

public class BaseBall {

    // Properties
    private boolean isAL;
    private int capacity;

    // Behaviors
    public boolean isAL() {
        if (isAL)
            return true;

        return false;
    }

    public void bounces() {
        System.out.println("Baseball is bouncing....");
    }
}
