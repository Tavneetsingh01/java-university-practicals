import java.util.Scanner;

public class Patterns {
    // Function to print Star L shaped Pattern
    public void Pattern_Star_L(int r) {
        int no_of_rows = r;

        for (int i = 1; i <= no_of_rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to print Number L shaped pattern
    public void Pattern_Number_L(int r) {
        int no_of_rows = r;

        for (int i = 1; i <= no_of_rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Function to print Star Pyramid Pattern
    public void Pattern_Star_Pyramid(int r) {
        int no_of_rows = r;
        int space = no_of_rows - 1;
        for (int j = 1; j <= no_of_rows; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j <= no_of_rows - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (no_of_rows - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Function to print Number Pyramid Pattern
    public void Number_Pyramid_Pattern(int r) {
        int no_of_rows = r;
        int space = no_of_rows - 1;
        for (int i = 1; i <= no_of_rows; i++) {
            int n = 8;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = space; i >= 1; i--) {
            int n = 10;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    // Main driver function
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows for star L shaped pattern:");
        int rows_for_star_L = sc.nextInt();
        patterns.Pattern_Star_L(rows_for_star_L);

        System.out.println("\nEnter no of rows for number L shaped pattern:");
        int rows_for_number_L = sc.nextInt();
        patterns.Pattern_Number_L(rows_for_number_L);

        System.out.println("\nEnter no of rows for star shaped pyramid pattern:");
        int rows_for_star_Pyramid = sc.nextInt();
        patterns.Pattern_Star_Pyramid(rows_for_star_Pyramid);

        System.out.println("\nEnter no of rows for number shaped pyramid pattern:");
        int rows_for_Number_Pyramid = sc.nextInt();
        patterns.Number_Pyramid_Pattern(rows_for_Number_Pyramid);
    }
}