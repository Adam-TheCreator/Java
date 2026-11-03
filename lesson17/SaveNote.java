// Written by Claude

void main() throws Exception {
    String task = IO.readln("What do you need to do? ");
    String when = IO.readln("When? ");

    String text = "TO DO\n" + "Task: " + task + "\n" + "When: " + when + "\n";

    Files.writeString(Path.of("lesson17/todo.txt"), text);

    IO.println("Saved to lesson17/todo.txt");
}
