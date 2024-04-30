import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        //Generating random numbers
        Random random = new Random();
        int starting = 1;
        int ending = 101;
        int[] randomArray = new int[100];
        for (int i = 0; i < 100; i++) {
            randomArray[i] = random.nextInt(ending - starting) + starting;
        }
        System.out.println("\nArray before sorting is:");
        for (int randomNumber : randomArray) {
            System.out.println(randomNumber + ", ");
        }

        Arrays.sort(randomArray);

        System.out.println("\nArray after sorting is:");
        for (int sortedNumber : randomArray) {
            System.out.println(sortedNumber + ", ");
        }
       // we can also use this following approach to print array in a single line
       // System.out.println(Arrays.toString(randomArray));
    }
}
