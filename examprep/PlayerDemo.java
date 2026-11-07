import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Player other) {
        return this.score - other.score;
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Robert", 81));
        players.add(new Player("Emily", 91));
        players.add(new Player("Carlos", 73));

        Collections.sort(players);

        for (Player p : players) {
            System.out.println(p.name + ": " + p.score);
        }
    }
}
