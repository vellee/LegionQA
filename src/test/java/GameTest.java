import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import projectDiceGame.Dice;
import projectDiceGame.Main;
import projectDiceGame.Game;
import projectDiceGame.Player;

import org.junit.jupiter.api.Assertions.*;


public class GameTest {
    @Test
    public void moveTest() {

    }

    @Test
    public void isInRangeTest() {
        Dice dice = new Dice(6);
        int result = dice.throwDice();
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result <= 6 && result >= 1);
    }

    //    @Test
//    public void numberOfPlayersTest(){
//
//        Assertions.assertNotNull();
//        Assertions.assertTrue(numberOfPlayers<=10 && numberOfPlayers>=2);
//    }
    @Test
    public void checkPlayer() {
        Player player1 = new Player(1, "Jonny");
        Assertions.assertNotNull(player1.getPlayerId());
        Assertions.assertNotNull(player1.getPlayerName());
    }

}
