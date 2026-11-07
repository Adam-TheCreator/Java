//interfaces

interface Attacker {
    void attack();
}
interface Healer {
    void heal();
}

class Paladon implements Attacker, Healer{
    public void attack(){
        System.out.println("The Paladin Strikes!");
    }
    public void heal(){
        System.out.println("The Paladin heals");
    }
}
public class Paladin {
    public static void main(String[] args){
        Attacker a = new Paladon();
        a.attack();
        }  
    }

