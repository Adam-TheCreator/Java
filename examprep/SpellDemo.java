abstract class Spell {
    String name;

    Spell(String name) {
        this.name = name;
    }

    abstract void cast();
}

class Fireball extends Spell {
    Fireball(String name) {
        super(name);
    }

    void cast() {
        System.out.println(name + " explodes in flame!");
    }
}

class IceShard extends Spell {
    IceShard(String name) {
        super(name);
    }

    void cast() {
        System.out.println(name + " pierces with ice!");
    }
}

public class SpellDemo {
    public static void main(String[] args) {
        Spell s1 = new Fireball("Inferno");
        Spell s2 = new IceShard("Frost Lance");
        s1.cast();
        s2.cast();
    }
}
