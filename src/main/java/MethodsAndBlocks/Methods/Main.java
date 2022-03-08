package MethodsAndBlocks.Methods;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    /*
        Create a method called displayHighScorePosition
        it should a player name as a parameter and a 2nd parameter as a position in the high score table
        You should display the players name along with a message like "managed to get into position" and the
        position they got a further message on the high score table.

        Create a 2nd method called calculateHighScorePosition
        it should send one argument only, the player score
        it should return sata should be
        1 if the score is > 1000
        2 if the score is > 500 and < 1000
        3 if the score is > 100 and < 500
        4 in all other cases
        call both methods and display the results of the following
        a score of 1500, 900, 400 and 50
    */

    public static void displayHightScorePosition() {

    }

    public static void calculateHighScorePosition() {

    }
}
