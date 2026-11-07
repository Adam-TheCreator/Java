//ABSTRACT

abstract class Monster{
    String name;
    Monster(String name){
        this.name = name;
    }
    abstract void attack();
}
class Goblin extends Monster{
    Goblin(String name){
            super(name);
    }
    void attack(){
        System.out.println(name + " attacked!");
    }
}
class Dragon extends Monster{
    Dragon(String name){
            super(name);
    }
    void attack(){
        System.out.println(name + " attacked!");
    }
}
public class YourAbstract{
    public static void main(String[] args){
        Goblin g1 = new Goblin("Torek");
        Dragon d1 = new Dragon("Drekky");
        g1.attack();
        d1.attack();
    }
}
  