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
int Hitpow(){
    String strength = IO.readln("How strong are you?");
    int attackpow = Integer.parseInt(strength);
    int streng = attackpow *2;
    return streng;
}
  int Fight(monsters monster, int pow){
      while (monster.health > 0){
          String attack = IO.readln("The " + monster.names + " appeared in front of you, attack or run! : ");

          if (attack.equalsIgnoreCase("run")){
              IO.println("You barely escaped with your life! ");
              return 0;
          }

          if (attack.equalsIgnoreCase("attack")){
              monster.health = monster.health - pow;
              IO.println("You hit the " + monster.names + ", it has " + monster.health + " health left!");
          } else {
              IO.println("You decided not to attack!");
          }
      }

      IO.println("The " + monster.names + " is defeated and dropped " + monster.loot + " gold!");
      return monster.loot;
  }
void main(){
    String heroname = IO.readln("What is your name Hero? ");
    int pow = Hitpow();
    IO.println(heroname + " enters the dungeon with " + pow + " hit power!");

    monsters Goblin = new monsters("Goblin",10, 3);
    monsters Slime = new monsters("Slime",20, 10);
    monsters Dragon = new monsters("Dragon",30, 20);
    monsters[] monstergroup = {Goblin, Slime, Dragon};

      int total = 0;

      for (int i = 0; i < monstergroup.length; i++) {
          total = total + Fight(monstergroup[i], pow);
      }

      IO.println(heroname + " leaves the dungeon with " + total + " gold!");

      if (total >= 30) {
          IO.println("Rank: Dragon Slayer");
      } else if (total >= 10) {
          IO.println("Rank: Adventurer");
      } else {
          IO.println("Rank: Coward");
      }
  }