//Comparable
import java.util.Collections;
import java.util.ArrayList;

class Monster implements Comparable<Monster>{
    String name;
    int health;

    Monster(String name, int health){
        this.name = name;
        this.health = health;
    }
    public int compareTo(Monster other){
        return this.health - other.health;
    }
}

public class MonsterSort{
    public static void main(String[] args){
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("Goblin", 10));
        monsters.add(new Monster("Kraken", 80));
        monsters.add(new Monster("Dragon", 50));

        Collections.sort(monsters);
        
        for (Monster m : monsters){
            System.out.println(m.name + ": " + m.health);
        }
        
    }
}