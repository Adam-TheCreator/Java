// Written by Claude

void main() throws Exception {
    String fileName = IO.readln("Which file? ");

    List<String> lines = Files.readAllLines(Path.of(fileName));

    int blank = 0;

    for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);

        if (line.isBlank()) {
            blank = blank + 1;
        }
    }

    IO.println(fileName + " has " + lines.size() + " lines.");
    IO.println(blank + " of them are blank.");
}
