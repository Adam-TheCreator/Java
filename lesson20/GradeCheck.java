//Written Adam

//Writing errors

class ScoreException extends Exception{
    ScoreException(String message) {
        super(message);
    }
}
class NameException extends Exception{
    NameException(String error){
        super(error);
        }
    }
String checkName(String answer) throws NameException{
    if (answer.isBlank()){
        throw new NameException("Invalid Name");
    }
    return answer;

}
int checkScore(int grade) throws ScoreException{
    if (grade < 0 || grade >100) {
        throw new ScoreException("Invalid Score");
    }
    return grade;

}

void main (){
    while (true){
        String answer = IO.readln("What is the Name of the student? : ");
    
    try {
        String[] parts = answer.split(",");
        String name = checkName(parts[0].trim());
        int grade = checkScore(Integer.parseInt(parts[1].trim()));

        String Gradeletter;
        switch(grade / 10){
            case 10:
            case 9:
                Gradeletter = "A";
                break;
            case 8:
                Gradeletter = "B";
                break;
            case 7:
                Gradeletter = "C";
                break;
            case 6:
                Gradeletter = "D";
                break;
            case 5:
                Gradeletter = "F";
                break;      
            default:
                Gradeletter = "F";      
        }
        IO.println(name + " has a grade of " + Gradeletter + " ");
        break;
            } catch (NumberFormatException e) {
            IO.println("Use whole numbers only.");
            } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Put a ' , ' between the Students name and Grade.");
            } catch (ScoreException e) {
            IO.println("Invalid Score, inpute 0-100 ");
            } catch (NameException e) {
            IO.println("Invalid Name");
            
        }
    }
}
