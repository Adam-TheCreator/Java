// Written by Adam
//Times table. 

void main() {
    String answer = IO.readln("Provide a number: ");
    int number = Integer.parseInt(answer);
    
    String limit = IO.readln("How many times should we multiply it? ");
    int mult = Integer.parseInt(limit);

    for (int i = 1; i <= mult; i++ ) {

        IO.println(number + " x " + i + " = " + number * i );
    }
}