import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheckQ4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new FileInputStream("reader.txt"));
            PrintWriter output = new PrintWriter(new FileOutputStream("writer.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
        while (input.hasNextLine()) {
            output.println(input.nextLine());
        }
    }
}
