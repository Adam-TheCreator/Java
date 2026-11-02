// Written by Claude

class Hero {
    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    int heal(int amount) {
        health = health + amount;
        return health;
    }
}

void main() {
    Hero knight = new Hero("Knight", 10);

    int afterSmall = knight.heal(2);
    IO.println("A small potion brings the " + knight.name + " to " + afterSmall + " health.");

    int afterBig = knight.heal(20);
    IO.println("A big potion brings the " + knight.name + " to " + afterBig + " health.");

    if (afterBig >= 30) {
        IO.println("The " + knight.name + " is fully healed!");
    }
}
