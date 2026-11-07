import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckQ3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("data.txt"));
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        System.out.println("loop ended");
    }
}
