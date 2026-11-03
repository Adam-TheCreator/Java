// Written by Claude

void main() {
    while (true) {
        String answer = IO.readln("How old are you? ");

        try {
            int age = Integer.parseInt(answer);
            IO.println("Next year you will be " + (age + 1) + ".");
            break;
        } catch (NumberFormatException e) {
            IO.println("That is not a whole number. Try again.");
        }
    }

    IO.println("Thanks!");
}
