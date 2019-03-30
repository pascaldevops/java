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
        // default constructor
    }

    public Ball(String color, String name, int capacity, int bounceRate) {
        this.color = color;
        this.name = name;
        this.capacity = capacity;
        this.bounceRate = bounceRate;
    }

    public Ball(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Ball(String color, String name, int capacity) {
        this.color = color;
        this.name = name;
        this.capacity = capacity;
    }

    // Behaviors
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public String getBallType() {
        return ballType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
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
