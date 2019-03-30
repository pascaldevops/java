package com.tipizo.introclasses;

public class Ball {

    // Properties or instance variables
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;
    private String ballType;

    // Constructor

    public Ball() {
        //
    }

    public Ball(String color, String name, int capacity, int bounceRate) {
        this.color = color;
        this.name = name;
        this.capacity = capacity;
        this.bounceRate = bounceRate;
    }

    // Behaviors
    public void showColor() {
        System.out.println("Ball color is: " + color);
    }

    public void showName() {
        System.out.println("Ball name is: " + name);
    }

    public void showCapacity() {
        System.out.println("Ball capacity: " + capacity);
    }

    public void showBounceRate() {
        System.out.println("Ball bounce rate: " + bounceRate);
    }

    public void bounces() {
        System.out.println("Bounce");
    }

    public void deflates() {
        System.out.println("Deflate");
    }

    public void inflates() {
        System.out.println("Inflates");
    }

}
