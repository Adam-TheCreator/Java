//Writted by Adam
//Review of the fundamentals

void main(){
    String user = IO.readln("What is your name? : ");
    String tries = IO.readln("how many tries do you want? : ");

    int trys = Integer.parseInt(tries);
    int attempts = 0;
    
    String prompt = IO.readln("What is the password? ");

        while (trys > 0){
            attempts = attempts +1;
        if (prompt.equals ("pass1234")){
            IO.println("Welcome " + user + " it took you " +  attempts + " tries to login.");
            break;
        }else{
            trys = trys - 1;
            IO.println("Wrong attempt, you have " + trys + " remaining.");
            if (trys > 0) {
            prompt = IO.readln("Input the password again : ");
            }

        }
            if (trys <= 0){
        IO.println("You have run out of attempts!");
        }
    }
}

