//classes

class monsters {
    String names;

    int health;
    int level;
    
    monsters(String names, int health, int level){
        this.names = names;
        this.health = health;
        this.level = level;
    IO.println("The monster is a " + names + ", it has " + health + " health and is level " + level);

    }
}

void main(){
    monsters Goblin = new monsters("Goblin",10, 80);
    monsters Dragon = new monsters("Dragon",20, 10);
    monsters Gorlak = new monsters("Gorlak",30, 40);
    monsters Wavern = new monsters("Wavern",50, 20);
    monsters Kraken = new monsters("Kraken",60, 10);
    monsters[] monstergroup = {Goblin, Dragon, Gorlak, Wavern, Kraken};

    String attack = IO.readln("Do you want to smack the goblin? (yes/no) : ");
    if (attack.equalsIgnoreCase ("yes")){
        Goblin.health = Goblin.health - 1;
        IO.println("You smacked that green fucker! Now his health is " + Goblin.health);
    } else {
        IO.println("Yeah I guess he doesnt deserve it.");
    }
    for (int i = 0; i < monstergroup.length; i++) {
        IO.println("the monster " + monstergroup[0+i].names + " appears to have " + monstergroup[0+i].health + " health!" );
    }


}