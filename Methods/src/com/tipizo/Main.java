package com.tipizo;

public class Main {

    public static void main(String[] args) {
        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 3;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);*/

        calculateScore(true, 800, 4, 200);


        int highScore = calculateScore2(false, 300, 2, 50);
        System.out.println("Your final score was: " + highScore);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
        }
    }

    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}