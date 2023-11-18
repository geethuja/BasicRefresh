public class CodeChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
      /*
        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was "+finalScore);

        }
        above code is replaced with function: calculateScore();
        */

        calculateScore(gameOver,score,levelCompleted,bonus);

  /*    Rewrite the same code about without changing code ;
  1 way copy code and create new variable by adding new to old variable name

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = score;

        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was "+newFinalScore);
        }

        Below code used memory more efficiency than above solution ;
          But remember this is a duplicate code
         it can be solved by using methods

        score = 8000;
        levelCompleted = 8;
        bonus = 300;

        finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was "+finalScore);

        }*/
        score = 8000;
        levelCompleted = 8;
        bonus = 300;

        calculateScore(gameOver,score,levelCompleted,bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }
}
