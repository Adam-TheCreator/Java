// Lesson 12: Arrays hold a list of things in one box.

void main() {
    String[] potions = {"Healing", "Speed", "Invisibility"};

    IO.println(potions[0]);
    IO.println(potions[2]);
    IO.println("There are " + potions.length + " potions");

    for (int i = 0; i < potions.length; i++) {
        IO.println("Shelf " + i + " holds a " + potions[i] + " potion");
    }
}
