interface Walker {
    void walk();
}

interface Swimmer {
    void swim();
}

class Duck implements Walker, Swimmer {
    public void walk() {
        System.out.println("waddle");
    }

    public void swim() {
        System.out.println("paddle");
    }
}

public class DuckTest {
    public static void main(String[] args) {
        Duck w = new Duck();
        w.walk();
        w.swim();
    }
}
