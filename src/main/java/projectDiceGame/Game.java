package projectDiceGame;

import StaticClassesEnumsExceptions.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {

    Player[] listP;
    String winnerName = "";
    int winnerId;
    private Dice d;
    int[] Score;
    int result = 0;
    int status = 0;
    private static final Logger logger = LogManager.getLogger(Game.class);

    public String getWinnerName() {
        return winnerName;
    }


    public Game(Player[] listP, Dice d) {


        this.listP = listP;
        this.d = d;
        this.Score = new int[listP.length];


    }

    public void doMove() {

        logger.info("Players throw dice, and determining a winner");
        logger.info("Printing out ids,names and scores for each player");
        for (int i = 0; i < listP.length; i++) {
            Score[i] = d.throwDice();
            if (Score[i] > result) {
                winnerName = listP[i].playerName;
                winnerId = listP[i].playerId;
                result = Score[i];
                status = 1;
            } else {

                status = 0;
            }


            System.out.println(String.format("Player's Id: %d, Player's name: %s, Player's score: %d.", listP[i].playerId, listP[i].playerName, Score[i]));
            logger.info(String.format("Player's Id: %d, Player's name: %s, Player's score: %d.", listP[i].playerId, listP[i].playerName, Score[i]));

        }


    }

    public void toPrint() {
        if (status != 0) {
            System.out.println(String.format("And the winner is %S with score %d !", winnerName, result));
            logger.info(String.format("And the winner is %S with score %d !", winnerName, result));
        } else if (status == 0) {
            System.out.println("At least two players have the same score, play again !");
            logger.info("At least two players have the same score, play again !");
        }
    }


}
