package projectDiceGame;

import StaticClassesEnumsExceptions.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        int numberOfPlayers;
        Dice dice = new Dice(6);
        logger.info("Entering number of players");
        System.out.print("Enter number of players, please. Number should be between 2 and 10 : ");
        Scanner scanner = new Scanner(System.in);
        numberOfPlayers = scanner.nextInt();
        logger.info("Number of current players is " + numberOfPlayers);
        if (numberOfPlayers > 10 || numberOfPlayers < 2) {
            System.out.println("You have entered wrong number of player, try again");
            scanner.close();
        } else {
            Player[] playerList = new Player[numberOfPlayers];

            ManagerIO inputP = new ManagerIO(playerList);


            Game game = new Game(inputP.getArrayPlayers(), dice);

            game.doMove();

            logger.info("Printing out a winner");
            game.toPrint();

        }


    }


}
