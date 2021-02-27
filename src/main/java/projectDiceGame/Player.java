package projectDiceGame;


public class Player {

    int playerId;
    String playerName;


    public Player(int id, String name) {
        this.playerId = id;
        this.playerName = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
