// This is my chance to show what i have learned, making print statements then agging items to a container

void main() {
    String purse = " Coins";
    int coins = 10;
    IO.println("I have " + coins + purse);

    int found = 12;
    coins = coins + found; 
    IO.println("I found " + found + purse + " now I have " + coins + purse);

    int paid = 7;
    coins = coins - paid;
    IO.println("I bought a snack, now I have " + coins + purse);

    coins = coins * 2;
    IO.println("A wizard cast a spell and doubled my" + purse + " now I have " + coins + purse);

}