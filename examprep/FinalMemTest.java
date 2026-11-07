//Trying to write a final from memory

//Classic syntax sucks

public class FinalMemTest{
    public static void main(String[] args){
        try{
            int x = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Invalid Operation");
        }   catch(RuntimeException e){
            System.out.println("Invalid Runtime");
        } finally{
            System.out.println("Opertaion Complete");
        }
    }
}