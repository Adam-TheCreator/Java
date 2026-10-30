// Written by Adam
//testing arrays

void main(){
    String[] monsters = {"Goblin", "Dragon", "Wizard", "Wavern"};
    String[] health = {"4", "25", "13", "17"};

    IO.println("Here comes a " +  monsters[0]);
    IO.println("Here comes the " + monsters[3]);
    IO.println("There are " + monsters.length + " monsters in line! ");
    
    for (int i = 0; i < monsters.length; i++) {
        IO.println("A wild " + monsters[0+i] + " appears, with " + health[0+i] + " health!" );
    }


}