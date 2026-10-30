// Written by Adam
// Menu for a small coffee shop

void menu () {
    IO.println("#####MENU#####");
    IO.println("#Coffee   -$6#");
    IO.println("#Espresso -$4#");
    IO.println("#Toast    -$4#");
    IO.println("#Berries  -$3#");
    IO.println("#####MENU#####");
}

void main() {
    IO.println("Welcome to my coffee shop, here is a menu of what we have available!");
    menu();
    String answer = IO.readln("Would you like to see that again? (yes / no): ");
    if (answer.equalsIgnoreCase ("yes")){
        menu();
    }
    IO.println("Thank you come again!");  
}
