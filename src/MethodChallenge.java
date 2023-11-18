public class MethodChallenge {

    public static void main(String[] args) {

        int playerScore = 1500;
        int highScorePosition = calculateHighScorePosition(playerScore);
        displayHigherScorePosition("Tom", highScorePosition);

        playerScore = 1000;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHigherScorePosition("Shammi", highScorePosition);

        playerScore = 500;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHigherScorePosition("Kohli", highScorePosition);

        playerScore = 100;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHigherScorePosition("Ganguli", highScorePosition);

        playerScore = 25;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHigherScorePosition("Viarad", highScorePosition);

    }

    public static int calculateHighScorePosition(int playerScore){

        int rank = 4;
        if(playerScore >= 1000){
            rank = 1;
        } else if (playerScore >= 500) {
            rank = 2;
        } else if (playerScore >= 100) {
            rank = 3;
        }
        return rank;

    }

    public static void displayHigherScorePosition(String playerName, int highScorePosition){

        System.out.println("The player " +
                playerName +
                " managed to get into higher position " +
                highScorePosition);

    }
}
