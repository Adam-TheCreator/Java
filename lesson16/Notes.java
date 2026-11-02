//Written by Adam
//Finds comments in code

void main() throws Exception{
    String fileName = IO.readln("What is the name of the file? : ");

    List<String> lines = Files.readAllLines(Path.of(fileName));
    String comment = "//";

    int note = 0;

    for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);
        if (line.contains(comment)){
            note = note + 1;
            IO.println("The comments occur at Line: " + (i+1) + " " + line);

        }

    }

    int blank = 0;

    for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);

        if (line.isBlank()) {
            blank = blank + 1;
        }
    }

    IO.println(fileName + " has " + lines.size() + " lines.");
    IO.println(blank + " of them are blank.");
    IO.println(note + " are comments.");

}