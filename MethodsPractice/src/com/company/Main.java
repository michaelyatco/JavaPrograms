package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 100;
	    int levelCompleted = 10;
	    int bonus = 5;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    System.out.println("Your final score was " + highScore);

	    int highScorePosition = calculateHighScorePosition(1500);
	    displayHighScorePosition("Mike", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println (playerName + " has managed to get into the position of "
            + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >=100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }
}
