import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Check2 {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("brand_new_file.txt");
            out.println("hello");
            out.close();
            System.out.println("No exception happened.");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException was thrown.");
        }
    }
}
