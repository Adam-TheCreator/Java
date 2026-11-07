interface Attacker {
    void attack();
}

interface Healer {
    void heal();
}

class Paladon implements Attacker, Healer {
    public void attack() {
        System.out.println("The Paladin Strikes!");
    }

    public void heal() {
        System.out.println("The Paladin heals");
    }
}

public class ProveIt {
    public static void main(String[] args) {
        Attacker a = new Paladon();
        Healer h = new Paladon();

        a.attack();
        h.heal();

        // now that a "Healer version" of the line exists too...
        a.heal();
    }
}
