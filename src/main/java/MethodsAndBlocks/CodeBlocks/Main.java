package MethodsAndBlocks.CodeBlocks;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

        boolean newGameOver = true;
        int newScore = 1000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
