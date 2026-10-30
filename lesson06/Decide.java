// Lesson 6: Making decisions with if.

void main() {
    String answer = IO.readln("How many coins do you have? ");
    int coins = Integer.parseInt(answer);

    int snack = 5;

    if (coins >= snack) {
        IO.println("You can buy the snack!");
    } else {
        IO.println("Sorry, you can't afford the snack.");
    }

    IO.println("Goodbye!");
}
