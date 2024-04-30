import java.util.Scanner;

public class CountOccurences {
    public String str;
    public String newString;

    public void CountOccurencesOfword() {
        String countWord;
        int count = 0;
        System.out.println("\nEnter the word which you want to count in string:");
        Scanner sc = new Scanner(System.in);
        countWord = sc.nextLine();
        String[] words = str.split(" ");
        for (String w : words) {
            if (w.equalsIgnoreCase(countWord)) {
                count++;
            }
        }
        System.out.println("The entered word \"" + countWord + "\" occures \"" + count + "\" times in our main string.");

    }

    public void CountOccurencesOfAlphbet() {
        String countChar;
        int count = 0;
        System.out.println("\nEnter the Alphabet or character which you want to count in string:");
        Scanner sc = new Scanner(System.in);
        countChar = sc.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (countChar.equalsIgnoreCase(String.valueOf(charArray[i]))) {
                count++;
            }
        }
        System.out.println("The entered word \"" + countChar + "\" occures \"" + count + "\" times in our main string.");

    }

    public static void main(String[] args) {
        CountOccurences countOccurences = new CountOccurences();
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String");
        countOccurences.str = take.nextLine();

        System.out.println("Enter 1 if you want to search for words and 2 if you want to count character:");
        int option = take.nextInt();
        if (option == 1) {
            countOccurences.CountOccurencesOfword();
        } else if (option == 2) {
            countOccurences.CountOccurencesOfAlphbet();
        } else {
            System.out.println(" Wrong option chosen. Please try again..");
        }

    }
}
