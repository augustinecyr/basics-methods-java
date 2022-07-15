package practice.methods;

public class Main {
    public static void main(String[] args) {
        // 1st line of input
      int highScore =  calculateScore(true, 800, 5, 100);
      System.out.println("Your final score was " + highScore);
    }

    // method using static void
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore; // to return a value , you require an else condition.
        } else {
            // -1 is used to indicate error
            return -1;
        }

    }
}
