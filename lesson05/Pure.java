//Interactive coin purse. 

void main() {
    String have = IO.readln("How many coins are you starting with? ");
    String purse = " coins";
    int coins = Integer.parseInt(have);
    IO.println("You have " + coins + purse );

    String found = IO.readln("How many coins did you find? ");
    int aquired = Integer.parseInt(found);
    coins = coins + aquired;
    IO.println("You found " + aquired + purse + ", now you have " + coins + purse);

    String paid = IO.readln("How much does the snack cost? ");
    int spent = Integer.parseInt(paid);
    if (spent <= coins) {
        while (spent <= coins){
            IO.println("You can buy the snack!");
            String answer = IO.readln("Do you want to buy the snack? (yes / no)");
       
        if (answer.equals ("yes") ) {
            IO.println("You bought a snack, enjoy!");
            coins = coins - spent;
        
        } else { 
            IO.println("You didnt buy a snack!");
            break;
        }
        if (coins <= 0 ) 
            IO.println("You are out of coins.");

        IO.println("Now you have " + coins + purse);

        }
    } else {
        IO.println("You can not buy the snack, get fucked!");
    }


    coins = coins * 2;
    IO.println("Wowee the wizard doubled your coins, oh my goodness! How could you ever repay him, oh my word, now you have, " + coins + purse);
}