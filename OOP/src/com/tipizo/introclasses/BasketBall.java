package com.tipizo.introclasses;

public class BasketBall extends Ball {

    // Properties
    private boolean isNBA;
    public int capacity;

    // Behaviors
    public boolean isNBA() {
        if (isNBA)
            return true;

        return false;
    }

    // Override
    public void bounces() {
        System.out.println("Basketball bouncing....");
    }
}
