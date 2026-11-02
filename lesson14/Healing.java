// Written by Claude

class Hero {
    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void drinkPotion() {
        health = health + 5;
        IO.println(name + " drinks a potion and now has " + health + " health!");
    }
}

void main() {
    Hero knight = new Hero("Knight", 10);
    Hero wizard = new Hero("Wizard", 4);

    knight.drinkPotion();
    wizard.drinkPotion();
    wizard.drinkPotion();
}
