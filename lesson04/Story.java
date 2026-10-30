//making stry with inputs

void main() {
    String animal = IO.readln("What is your favorite animal? ");
    String color = IO.readln("What is your favorite color? ");
    String place = IO.readln("What is your favorite place? ");
    place = place.replace("the ", "");

    IO.println("A big " + color +" "+ animal + " walked slowly to " + place + " then it spiraled around the " + place + "!");
}