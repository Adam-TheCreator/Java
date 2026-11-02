//Written by Adam

//Searchs a file for a word

void main() throws Exception{
    String fileName = IO.readln("What file do you want to search? : ");
    List<String> lines = Files.readAllLines(Path.of(fileName));
    String searchword = IO.readln("What word do you want to search for? : ");
   
    int has = 0;

    for (int i = 0; i < lines.size(); i++){
    String line = lines.get(i);
    if (line.contains(searchword)){
        has = has + 1;
            IO.println("The words occur at Line: " + (i+1) + line);
        }
    }
    IO.println("The file " + fileName + " has " + lines.size()+ " lines.");
    IO.println("This file contains " + has + " of that word");
}
