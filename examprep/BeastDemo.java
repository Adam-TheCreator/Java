abstract class Beast {
    String name;

    Beast(String name) {
        this.name = name;
    }

    abstract void roar();
}

class Wolf extends Beast {
    Wolf(String name) {
        super(name);
    }

    void roar() {
        System.out.println(name + " howls at the moon!");
    }
}

class Bear extends Beast {
    Bear(String name) {
        super(name);
    }

    void roar() {
        System.out.println(name + " growls and swipes!");
    }
}

public class BeastDemo {
    public static void main(String[] args) {
        Wolf w = new Wolf("Shadowfang");
        Bear b = new Bear("Ironclaw");
        w.roar();
        b.roar();
    }
}
