import java.util.Arrays;
import java.util.Scanner;

class ArrayDimension {
    int[] arryi;
    int[][] arrys;

    void OneDArrayMake() {


        System.out.println("How many numbers you want to enter in 1D Array :");
        Scanner inp = new Scanner(System.in);

        int scai = inp.nextInt();
        arryi = new int[scai];

        System.out.println("Enter " + scai + " values one by one and press enter after each entry:");
        for (int i = 0; i < scai; i++) {
            Scanner inparryi = new Scanner(System.in);
            arryi[i] = inparryi.nextInt();
        }

        System.out.println("Values you Entered:");
        int i = 0;
        for (int b : arryi) {
            System.out.println("Value enterd at arryi[" + i + "] is: " + b);
            i++;
        }

    }

    void OneDArrFunction() {
        System.out.println("\nLength of the entered one Dimension array is: " + arryi.length);
        System.out.println("Maximum value entered in one Dimension array is: " + Arrays.stream(arryi).max());
        System.out.println("Minimum value entered in one Dimension array is: " + Arrays.stream(arryi).min());
        System.out.println("Hash code of 1D Array is : " + Arrays.hashCode(arryi) + "\n");
    }


    void TwoDArrayMake() {


        System.out.println("\nHow many columns you want to have in your 2D array:");
        Scanner inpc = new Scanner(System.in);
        int scaicol = inpc.nextInt();

        System.out.println("Enter how many rows  you want to have in your 2D array:");
        Scanner inpr = new Scanner(System.in);
        int scairow = inpr.nextInt();

        arrys = new int[scairow][scaicol];

        System.out.println("Enter " + scaicol * scairow + " values one by one and press enter after each entry:");
        for (int r = 0; r < scairow; r++) {
            for (int c = 0; c < scaicol; c++) {
                System.out.println("Enter the value you want to put at (" + r + ',' + c + ") :");
                Scanner inparrys = new Scanner(System.in);
                arrys[r][c] = inparrys.nextInt();
            }
        }

        System.out.println("\nValues you Entered in 2D array is: ");
        int i = 0;
        int j = 0;
        for (int[] r : arrys) {
            for (int c : r) {
                System.out.println("Entered value at (" + i + "," + j + ") is: " + c);
                j++;
            }
            i++;
            j = 0;
        }
    }

    void TwoDArrFunction() {
        System.out.println("\nLength of the entered 2D array is: " + arrys.length);

        System.out.println("Hash code of entered 2D Array is :" + Arrays.hashCode(arrys));
    }

}


public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDimension AOD = new ArrayDimension();
        AOD.OneDArrayMake();
        AOD.OneDArrFunction();
        AOD.TwoDArrayMake();
        AOD.TwoDArrFunction();
    }

}
