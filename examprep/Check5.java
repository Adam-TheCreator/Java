import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Check5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileOutputStream("whatever.txt"));
        System.out.println(sc.nextLine());
    }
}
