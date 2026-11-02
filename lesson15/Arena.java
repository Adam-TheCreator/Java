//Written by Adam
//Arena, Class method returning. 
class Monster {
    String name; 
    int health;

    Monster(String name, int health){ //monster class with a name and health
        this.name = name;
        this.health = health;
    }

    int takeHit(int attack){
        health = health - attack;  //remove health
        return health;
    } 
}
void main(){
    Monster Troll = new Monster("Troll", 20);
    if (Troll.health >= 0){ 
        int afterlight = Troll.takeHit(5);
        IO.println("You hit the " + Troll.name +" and its health is now " + afterlight);
        int afterheavy = Troll.takeHit(15);
        IO.println("You hit the " + Troll.name +" and its health is now " + afterheavy);
        if (Troll.health <= 0){
            IO.println("You defeated the " + Troll.name);
        }else{ 
            IO.println("You didn't defeat the " + Troll.name);
        
        }
    }
}