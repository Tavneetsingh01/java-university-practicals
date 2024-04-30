import java.util.Scanner;
/** Refer it again
*/public class EvenIndexes {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = take.nextLine();
        StringBuilder SBuilder = new StringBuilder();
        char[] stringCharacters = str.toCharArray();

        for (int i = 0; i < stringCharacters.length; i++) {
            char c = stringCharacters[i];

            if (i % 2 == 0) {
                if (i >= stringCharacters.length) {
                    c = 1; // this doesn't work
                } else if (i < stringCharacters.length) {
                    if ((i + 2) < stringCharacters.length) {
                        c = stringCharacters[i + 2];
                    }
                }

            }
            SBuilder.append(c);


        }
        System.out.println("Modified string is: " + SBuilder);

    }

}

