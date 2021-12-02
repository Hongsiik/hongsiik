package edu.pnu.admin;
import edu.pnu.collection.GenericList;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;
    private GenericList<Player> squad = new GenericList<Player>();

    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for (int i = 0; i < squad.size(); i++) {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public FootballClub(String team) {
        this.name = team;
    }

    public void addPlayer(Player newPlayer) {
        if (squad.size() < maxSquadSize)
            squad.set(newPlayer);
    }

    public void removeAllPlayer() {
        squad.clear();
    }

    public Player findPlayer(String playerFirstName, int jerseyNumber) {
        Player a = new Player(playerFirstName);
        Player b = new Player(jerseyNumber);
        for (int i = 0; i < squad.size(); i++) {
            if (squad.get(i).equals(a, b) == true) {
                {
                    return squad.get(i);
                }
            }
        }
        return null;
    }
}

