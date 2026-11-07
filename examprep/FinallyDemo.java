public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("-- case 1: no problem --");
        try {
            int x = 10 / 2;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Caught a problem");
        } finally {
            System.out.println("Finally ran");
        }

        System.out.println("-- case 2: with a problem --");
        try {
            int x = 10 / 0;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Caught a problem");
        } finally {
            System.out.println("Finally ran");
        }
    }
}
