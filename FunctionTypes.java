public class FunctionTypes {
    public static void staticFunction() {
        System.out.println("I am a static function\nAnd I dont need any object to create of my class in order to access it via another static function/method.");
    }

    public static void staticAddFunction(int a, int b) {
        System.out.println("Sum of numbers passed to this static add function is: " + (a + b));
    }

    public void nonStaticFunction() {
        System.out.println("I am a static function\nAnd I need an object to create of my class in order to access it via another static function/method.");
    }

    public static void main(String[] args) {
        staticFunction();
        staticAddFunction(17, 10);
        FunctionTypes functionTypes = new FunctionTypes();
        functionTypes.nonStaticFunction();
    }
}
