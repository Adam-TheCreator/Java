import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Check1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("overwrite_test.txt");
        // nothing written yet -- just opened it. Check the file NOW, in another terminal,
        // before this program even finishes.
        System.out.println("File opened, nothing written yet.");
    }
}
