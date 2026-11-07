//Trying to get ready for the exam

//Finally

public class YourFinally{
    public static void main(String[] args){

        int[] a = {1,2,3};
    
            try{
                System.out.println(a[10]);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Not Within Array!");
        }finally{    
            System.out.println("Cleanup complete!");
        }
    }
}