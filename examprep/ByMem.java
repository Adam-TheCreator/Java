//By mem abstracts

abstract class Weapon{
    String name;
    Weapon(String name){
    this.name = name;
}
}
class Sword extends Weapon{
    Sword(String name){
      super(name);
    }
    void damage(){
        System.out.println(name + " is used in an attack");
    }
}