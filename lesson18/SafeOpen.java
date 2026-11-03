//Written by Adam
//Getting harder, try , catch

void main() throws Exception{
    while(true){
        String fileName = IO.readln("What file do you want to search for? : ");
        

        try{
        List<String> lines = Files.readAllLines(Path.of(fileName));
            IO.println("the file " + fileName + " has " + lines.size() + " lines.");
            break;
        } catch (NoSuchFileException e) {
        IO.println("That file can not be found, Try again.");
        } catch (IOException e) {
        IO.println("You must enter a file name, Try again.");
    
        }
    }
}