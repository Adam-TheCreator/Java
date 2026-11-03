//Written by Adam
//.split and switch

void main (){
    while (true){
        String answer = IO.readln("What is the Name of the student? : ");
    
    try {
        String[] parts = answer.split(",");
        String name = parts[0].trim();
        int grade = Integer.parseInt(parts[1].trim());

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
    }
    }

}
