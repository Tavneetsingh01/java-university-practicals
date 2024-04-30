import java.util.Scanner;

public class CountVowels {
    public static void main(String args[]) {
        int vCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int[] count = new int[5];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A') {
                count[0]++;
            } else if (ch == 'e' || ch == 'E') {
                count[1]++;
            } else if (ch == 'i' || ch == 'I') {
                count[2]++;
            } else if (ch == 'o' || ch == 'O') {
                count[3]++;
            } else if (ch == 'u' || ch == 'U') {
                count[4]++;
            }
        }
        System.out.println("Count of 'a' vowel in entered string is = " + count[0]);
        System.out.println("Count of 'e' vowel in entered string is = " + count[1]);
        System.out.println("Count of 'i' vowel in entered string is = " + count[2]);
        System.out.println("Count of 'o' vowel in entered string is = " + count[3]);
        System.out.println("Count of 'u' vowel in entered string is = " + count[4]);

    }
}
