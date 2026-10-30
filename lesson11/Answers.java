// Written by Claude
// Lesson 11: Methods that hand back an answer.

int potionPrice(int size) {
    int price = size * 5;
    return price;
}

void main() {
    int small = potionPrice(1);
    int large = potionPrice(4);

    IO.println("A small potion costs " + small + " gold");
    IO.println("A large potion costs " + large + " gold");
    IO.println("A giant potion costs " + potionPrice(10) + " gold");
}
