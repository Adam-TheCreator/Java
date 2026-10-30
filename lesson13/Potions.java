// Written by Claude
// Lesson 13: Classes let you make your own type of box.

class Potion {
    String name;
    int power;

    Potion(String name, int power) {
        this.name = name;
        this.power = power;
    }
}

void main() {
    Potion small = new Potion("Small Healing", 10);
    Potion giant = new Potion("Giant Healing", 50);

    IO.println(small.name + " heals " + small.power);
    IO.println(giant.name + " heals " + giant.power);

    small.power = small.power + 5;
    IO.println(small.name + " now heals " + small.power);
    IO.println(giant.name + " still heals " + giant.power);
}
