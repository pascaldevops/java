package com.tipizo.nonhuman;

public class Fish  extends Animal {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void move() {
        System.out.println("Fish is moving...");
    }
}
