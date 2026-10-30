// Written by Adam
//project

class monsters {
    String names;

    int health;
    int level;
    int loot;
    monsters(String names, int health, int loot){
        this.names = names;
        this.health = health;
        this.loot = loot;
    IO.println("A " + names + " appears, with " + health + " health!");
    }
}

void main(){
    String heroname = IO.readln("What is your name Hero?");
    String strength = IO.readln("How strong are you?");
    
    int attackpow = Integer.parseInt(strength);
    int streng = attackpow * 2;
    IO.println(heroname + " enters the dungeon with " + streng + " hit power!");

    monsters Goblin = new monsters("Goblin",10, 3);
    monsters Slime = new monsters("Slime",20, 10);
    monsters Dragon = new monsters("Dragon",30, 20);
    monsters[] monstergroup = {Goblin, Slime, Dragon};


   for (int i = 0; i < monstergroup.length; i++) {
        while ( monstergroup[i].health > 0) {

        String attack = IO.readln("The " + monstergroup[i].names + " appeared in front of you, attack or run! : ");
        if (attack.equalsIgnoreCase ("run")){
            IO.println("You barely escaped with your life!");
        break;
        }else{
        }
        if (attack.equalsIgnoreCase ("attack")){
            monstergroup[i].health = monstergroup[i].health - streng;
            IO.println("You hit the " + monstergroup[i].names + ", it has " + monstergroup[i].health + " health left!");
        while (monstergroup[i].health <= 0){
            IO.println("The " + monstergroup[i].names + " is defeated and dropped " + monstergroup[i].loot + " gold!");
        break;
        }
        } else {
        IO.println("You decided not to attack!");

        }
    }


//    for (i = 0; i < monstergroup.length; i++) {
//       IO.println("the monster " + monstergroup[0+i].names + " appears to have " + monstergroup[0+i].health + " health!" );
    }
}
