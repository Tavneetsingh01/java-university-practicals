import java.util.Scanner;

public class SplitOnCharacterOrWord {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = take.nextLine();

        System.out.println("\nEnter any character or word in basis of which you want to split the main String:");
        String strSplit = take.nextLine();
        String[] words = str.split(strSplit);

        System.out.println("\nAfter doing splitting based on split word or string("+strSplit+") we get:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
