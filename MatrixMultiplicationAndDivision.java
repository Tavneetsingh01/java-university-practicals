import java.util.Scanner;

public class MatrixMultiplicationAndDivision {
    int scaicol;
    int scairow;
    int[][] one_array;
    int[][] another_array;

    void matrixMake() {
        System.out.println("\nHow many columns you want to have in your both 2D array/matrix:");
        Scanner inpc = new Scanner(System.in);
        scaicol = inpc.nextInt();

        System.out.println("Enter how many rows  you want to have in your 2D array:");
        Scanner inpr = new Scanner(System.in);
        scairow = inpr.nextInt();

        one_array = new int[scairow][scaicol];
        another_array = new int[scairow][scaicol];

        System.out.println("\nEnter values for (1st) 2D array/matrix");
        System.out.println("Enter " + scaicol * scairow + " values one by one and press enter after each entry:");
        for (int r = 0; r < scairow; r++) {
            for (int c = 0; c < scaicol; c++) {
                System.out.println("Enter the value you want to put at (" + r + ',' + c + ") :");
                Scanner inparrys = new Scanner(System.in);
                one_array[r][c] = inparrys.nextInt();
            }
        }
        System.out.println("Entered (1st) array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(one_array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnter values for (2nd) 2D array/matrix");
        System.out.println("Enter " + scaicol * scairow + " values one by one and press enter after each entry:");
        for (int r = 0; r < scairow; r++) {
            for (int c = 0; c < scaicol; c++) {
                System.out.println("Enter the value you want to put at (" + r + ',' + c + ") :");
                Scanner inparrys = new Scanner(System.in);
                another_array[r][c] = inparrys.nextInt();
            }
        }
        System.out.println("Entered (2nd) array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(another_array[i][j] + " ");
            }
            System.out.println();
        }

    }

    // This function specifies how to multiply two matrix
    public void multiply() {
        int[][] temp_array;
        temp_array = new int[scairow][scaicol];
        System.out.println("Multiplication of two entered matrix gives us following matrix:");
        for (int i = 0; i < scairow; i++) {
            for (int j = 0; j < scaicol; j++) {
                temp_array[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    temp_array[i][j] += one_array[i][k] * another_array[k][j];
                }
                System.out.print(temp_array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // This function specifies how to do addition of matrix
    public void addition() {
        int[][] temp_array;
        temp_array = new int[scairow][scaicol];
        System.out.println("\nAddition of two entered matrix gives us following matrix:");
        for (int i = 0; i < scairow; i++) {
            for (int j = 0; j < scaicol; j++) {
                temp_array[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    temp_array[i][j] += one_array[i][k] + another_array[k][j];
                }
                System.out.print(temp_array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main driver function of the program
    public static void main(String[] args) {
        MatrixMultiplicationAndDivision matrixMultiplicationAndDivision = new MatrixMultiplicationAndDivision();
        matrixMultiplicationAndDivision.matrixMake();
        matrixMultiplicationAndDivision.multiply();
        matrixMultiplicationAndDivision.addition();

    }
}
