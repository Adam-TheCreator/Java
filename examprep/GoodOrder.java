public class GoodOrder {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem");
        } catch (Exception e) {
            System.out.println("General exception");
        } finally {
            System.out.println("Done");
        }
    }
}
