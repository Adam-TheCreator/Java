//using methods to have a goblin battle

void monsters(String enemy, int health){
    int hits = 1 ;
 
    IO.readln("You encountered a "+ enemy + ", press enter to take them on!");
    for (hits = 1; hits <= health; hits++){
        int heart = health - hits;
        IO.println("you hit the " + enemy + " it now has " + heart+ " health");

    }
    IO.println("The enemy has been defeated");

}
void main(){
    IO.println("You encountered enemies on the road, prepare for battle!");
    monsters("Goblin",10);
    monsters("Dragon",8);
    monsters("Kraken",18);

    IO.println("You did it! All enemies has been defeated");

}