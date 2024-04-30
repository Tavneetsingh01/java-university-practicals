import java.util.Scanner;

public class CapitalizeLetterAtOddIndexes {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = take.nextLine();
        StringBuilder SBuilder = new StringBuilder();
        char[] stringCharacters = str.toCharArray();

        for (int i = 0; i < stringCharacters.length; i++) {
            char c = stringCharacters[i];

            if (i % 2 != 0) {
                c = Character.toUpperCase(c);
            }
            SBuilder.append(c);
        }

        System.out.println("Modified string is: " + SBuilder);
    }

}

