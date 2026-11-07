interface Fighter {
    void strike();
}

interface Caster {
    void castSpell();
}

class Warrior implements Fighter, Caster {
    public void strike() {
        System.out.println("Warrior swings an axe");
    }

    public void castSpell() {
        System.out.println("Warrior casts a weak spark");
    }
}

public class WarriorDemo {
    public static void main(String[] args) {
        Fighter f = new Warrior();
        f.strike();
        // f.castSpell();   <-- this line does not compile. Try uncommenting it.
    }
}
