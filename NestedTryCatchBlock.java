public class NestedTryCatchBlock {

    public static void main(String args[]) {
        try {
            try {
                System.out.println("Going to divide by 0");
                int b = 27 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[7];
                a[7] = 2;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        } catch (Exception e) {
            System.out.println("Handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }

}
