import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = take.nextLine();

        String[] words = str.split(" ");

        LinkedHashSet<String> hashSetWords = new LinkedHashSet<String>(Arrays.asList(words));

        StringBuilder newString = new StringBuilder();
        int i = 0;
        for (String w : hashSetWords) {
            if (i > 0) {
                newString.append(" ");
            }

            newString.append(w);
            i++;
        }


        System.out.println("After removal of duplicate words, new string formed is:  " + newString);
    }
}
