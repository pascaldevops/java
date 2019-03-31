package com.tipizo.planetearth;

public class Human {

    private String name;
    private int age;
    private int heightInInches;
    private String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walk...");
    }

    public void work() {
        System.out.println("work...");
    }
}
