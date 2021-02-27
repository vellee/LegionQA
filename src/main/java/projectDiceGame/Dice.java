package projectDiceGame;

import java.util.Random;

public class Dice {

    private static int numberOfEdges;
    Random rmNum;

    public Dice(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
        this.rmNum = new Random();
    }

    public int throwDice() {

        return rmNum.nextInt(numberOfEdges - 1) + 1;

    }

}
