import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckQ5 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter write = new PrintWriter("nums.txt");
        for (int i = 0; i < 12; i++) {
            write.println(i % 5);
        }
        write.close();
        System.out.println("console output: nothing above this line, check nums.txt");
    }
}
