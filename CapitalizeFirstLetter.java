import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = take.nextLine();


        // hello my name is tavneet
        String[] words = str.split(" ");

        // words[] = [hello, my, name, is, tavneet]

        String newString = "";

        for (String w : words) {
            String oneWord = w.substring(0, 1);
            String rest = w.substring(1);
            newString = newString + oneWord.toUpperCase() + rest + " ";
        }


        System.out.println("After Capitalization of First character of every word we have: " + newString.trim());
    }
}

