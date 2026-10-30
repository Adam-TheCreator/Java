// Lesson 10: Giving methods information.

void greet(String name) {
    IO.println("Hello, " + name + "!");
}

void showPrice(String item, int price) {
    IO.println(item + " costs " + price + " gold");
}

void main() {
    greet("Adam");
    greet("Sam");

    showPrice("Potion", 15);
    showPrice("Sword", 50);
}
