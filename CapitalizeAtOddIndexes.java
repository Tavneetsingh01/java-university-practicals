import java.util.Scanner;

public class CapitalizeAtOddIndexes {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = take.nextLine();

        char[] charArray = str.toCharArray();

        StringBuffer newString = new StringBuffer();


        for (int i = 0; i < str.length(); i++) {

            char c = charArray[i];
            if (i % 2 != 0) {
                c = Character.toUpperCase(c);
            }
            newString.append(c);
        }


        System.out.println("\nAfter Capitalization of character at odd indexes in a string we get: " + newString.toString());
    }
}
