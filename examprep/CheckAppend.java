import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckAppend {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("log.txt", true));
        out.println("NEW LINE ADDED");
        out.close();
    }
}
