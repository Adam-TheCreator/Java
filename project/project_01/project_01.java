// Written by Adam
//Showing off what i have learned, all code done without help. 
//A hero walks into a potion shop, buys potions, and then drinks them to heal.

void main() {
    
    int health = 50;
    int spent = 15;
    int restore = 10;
    int potions = 0;

    String name = IO.readln("What is your name dear sir? ");
   
    IO.println(name + ". Wow what a strong name! ");
   
    String gold = IO.readln("How much gold do you have? ");
   
    int wealth = Integer.parseInt(gold);

    if (spent <= wealth) {
        while (spent <= wealth){
            IO.println("You can buy the potion!");
            String answer = IO.readln("Do you want to buy the potion? (yes / no): ");
            answer = answer.replace("YES", "yes");
            answer = answer.replace("Yes", "yes");
            answer = answer.replace("yEs", "yes");
            answer = answer.replace("YEs", "yes");
            answer = answer.replace("yES", "yes");
            answer = answer.replace("yeS", "yes");
            answer = answer.replace("YeS", "yes");  

        if (answer.equals ("yes") ) {
            wealth = wealth - spent;
            potions = potions + 1;
            IO.println("You bought a potion, you now have " + potions + " potions");

        } else { 
            IO.println("You didnt buy a potion!");
            break;
        }
        if (wealth < spent ) 
            IO.println("You are out of gold.");
            IO.println("Now you have " + wealth + " gold");
        }
    } else {
    
        IO.println("You can not buy the potion, get fucked!");
    }
    if (potions >= 1 ){
        while (potions >= 1) {
            String drink = IO.readln("Would you like to have a potion now? You have " + potions + " potions" + " (yes/no): ");
            drink = drink.replace("YES", "yes");
            drink = drink.replace("Yes", "yes");
            drink = drink.replace("yEs", "yes");
            drink = drink.replace("YEs", "yes");
            drink = drink.replace("yES", "yes");
            drink = drink.replace("yeS", "yes");
            drink = drink.replace("YeS", "yes");      

            if (drink.equals ("yes") ) {
                potions = potions - 1;
                health = health + restore;
                IO.println("You drank a potion, you now have " + potions + " potions and " + health + " health! ");
            }else {
                IO.println("You did not drink a potion!"); 
                break;
        
            }

        }
    } 
    IO.println("After " + name + "'s visit to the potion maker you now have, " + wealth + " gold and " + health + " health!");

}
