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

        int scoreResult = calculateHighScorePosition(1500);
        displayHighScorePosition("Pascal", scoreResult);

        scoreResult = calculateHighScorePosition(900);
        displayHighScorePosition("Scott", scoreResult);

        scoreResult = calculateHighScorePosition(400);
        displayHighScorePosition("Paul", scoreResult);

        scoreResult = calculateHighScorePosition(50);
        displayHighScorePosition("Suzie", scoreResult);

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

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get  into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000 ) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}