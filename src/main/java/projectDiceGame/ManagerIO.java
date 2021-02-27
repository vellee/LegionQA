package projectDiceGame;

import StaticClassesEnumsExceptions.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ManagerIO {

    private static final Logger logger = LogManager.getLogger(ManagerIO.class);
    int numberOfPlayers;

    public Player[] getArrayPlayers() {
        return arrayPlayers;
    }

    public Player[] arrayPlayers;

    public ManagerIO(Player[] list) {

        this.arrayPlayers = list;
        this.numberOfPlayers = arrayPlayers.length;

        Scanner scanner = new Scanner(System.in);
        logger.info("Entering names of players");

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Enter name for player number " + i + " : ");
            String name = scanner.next();
            arrayPlayers[i - 1] = new Player(i, name);

        }


        scanner.close();


    }

}
