// Written by Adam
//using methods to have a goblin battle

int totalHealth(int health, int level) {
    health = health * level;
    return health;
    }

void enemyinfo(String enemy, int health, int level, int loot){
    int hits = 1 ;
    int enhealth = totalHealth(health, level);
    IO.readln("You encountered a "+ enemy + ", press enter to take them on!");
    for (hits = 1; hits <= enhealth; hits++){
        int heart = enhealth - hits;
        IO.println("you hit the " + enemy + " it now has " + heart+ " health");
        
    }
    IO.println("The enemy dropped " + loot + " gold!");
    IO.println("The enemy has been defeated");
    
}
void main(){
    IO.println("You encountered enemies on the road, prepare for battle!");
    enemyinfo("Goblin", 10, 2, 3);
    enemyinfo("Dragon", 8, 3, 10);
    enemyinfo("Kraken", 8, 4, 23);

    IO.println("You did it! All enemies has been defeated");

}