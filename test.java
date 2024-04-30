import java.util.Arrays;

public class test {

        public static void main(String[] args) {


            int[] arr = new int[100];
            for (int i = 0; i < 100; i++)
            { arr[i] = (int) (Math.random() * 100.0);
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

}
