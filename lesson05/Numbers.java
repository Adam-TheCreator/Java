// Lesson 5: Turning typed answers into real numbers.

void main() {
    String answer = IO.readln("How old are you? ");
    int age = Integer.parseInt(answer);

    age = age + 1;
    IO.println("Next year you will be " + age);
}
