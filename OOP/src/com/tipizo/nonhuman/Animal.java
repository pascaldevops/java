package com.tipizo.nonhuman;

public abstract class Animal {

    private String gender;
    private int age;
    private int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.gender = gender;
        this.age = age;
        this.weightInLbs = weightInLbs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeightInLbs() {
        return weightInLbs;
    }

    public void setWeightInLbs(int weightInLbs) {
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("eat....");
    }

    public void sleep() {
        System.out.println("sleep....");
    }

    public abstract void move();
}
