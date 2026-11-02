//Written by Adam 
// combinging monsters to make other monsters

class Monster {
    String name; 
    int health;

    Monster(String name, int health){ //monster class with a name and health, will add or subtract when combined
        this.name = name;
        this.health = health;
    }
}
void prompt () {
    IO.println("Welcome to the Monster Breeder! ");
}
String Monster(String first, String second){
    if( first.equalsIgnoreCase ("Dragon") && second.equalsIgnoreCase ("Ghost")){
        return "Ghost Dragon";
    }
    if( first.equalsIgnoreCase ("Wavern") && second.equalsIgnoreCase ("Dragon")){
        return "Drekky";
    }
    if( first.equalsIgnoreCase ("Wavern") && second.equalsIgnoreCase ("Ghost")){
        return "Feint Drek";
    }
    return "Nothing";
}

String Warning(String answer){
    if (answer.equals ("Drekky")){
        return "Be careful of their Fire!";
    }
        if (answer.equals ("Ghost Dragon")){
        return "Boooo!";
    }
        if (answer.equals ("Feint Drek")){
        return "I can barely see it!";
    }
    return "nothing";
}

void main(){
    Monster Dragon = new Monster("Dragon", 20);
    Monster Wavern = new Monster("Wavern", 15);
    Monster Ghost = new Monster("Ghost", 5);
    Monster Drek = new Monster("Ghost Dragon", 25);
    prompt();
    String monster1 = IO.readln("Choose the first monster you would like to combine?" +" "+ Dragon.name + " " + Wavern.name + " " + Ghost.name  + " : ");
    String monster2 = IO.readln("Chose the second monster you would like to combine? "+" "+ Dragon.name + " " + Wavern.name + " " + Ghost.name  + " : ");
    String outcome = Monster(monster1, monster2);
    String answer = outcome;
    IO.println("You bred a " + outcome);
    String warn = Warning(answer);
    IO.println(warn);
    }