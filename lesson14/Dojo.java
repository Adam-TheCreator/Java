// Written by ADAM
//Dojo, learnign how to write methods inside a class

class Dummy {
    String name; 
    int health;

    Dummy(String name, int health){
        this.name = name;
        this.health = health;
    }
    void takeHit(){
        health = health - 3;  //remove three health and explain
        IO.println(" You hit dummy " + name + " and splintered the wood! - " + health + " health");
    } 
}
void main(){ 
    Dummy one = new Dummy("First", 10);
    Dummy two = new Dummy("Two", 20);
    one.takeHit();
    one.takeHit();
    two.takeHit();
//two dummies with different state, hti the first twice, second once. 
}