public class ExitTrap {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("boom");
        } catch (RuntimeException e) {
            System.out.println("Caught it");
            System.exit(0);
        } finally {
            System.out.println("Finally ran");
        }
    }
}
