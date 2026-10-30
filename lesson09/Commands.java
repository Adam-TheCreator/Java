// Lesson 9: Making your own commands (methods).

void greet() {
    IO.println("Hello there!");
    IO.println("Welcome to my program.");
}

void main() {
    IO.println("The program starts here.");
    greet();
    IO.println("Back in main.");
    greet();
}
