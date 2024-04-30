import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManySeries {
    // function for generating even series
    public void evenSeries(int l) {
        int limit = l;
        List<Integer> series = new ArrayList<Integer>();
        System.out.println("Even series upto " + limit + " is:");
        for (int i = 0; i <= limit; i = i + 2) {
            series.add(i);
        }
        System.out.println(series);
    }

    // function for generating odds series
    public void oddSeries(int l) {
        int limit = l;
        List<Integer> series = new ArrayList<Integer>();
        System.out.println("Odd series upto " + limit + " is:");
        for (int i = 1; i <= limit; i = i + 2) {
            series.add(i);
        }
        System.out.println(series);
    }

    // function for generating fibonacciSeries
    public void fibonacciSeries(int l) {
        int limit = l;
        int firstTerm = 0;
        int secondTerm = 1;
        List<Integer> series = new ArrayList<Integer>();
        System.out.println("Fibonacci series upto " + limit + " is:");
        for (int i = 1; i <= limit; i++) {
            series.add(firstTerm);
            // now computing the next terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(series);
    }

    // function for generating sine series
    public void sineSeries(int l, int sine_term) {
        float no_of_terms = l;
        float radian = sine_term;
        int i, j, f, s = 1;
        float sum = 0;
        radian = (float) (radian * 3.14159 / 180);
        for (i = 1; i <= no_of_terms; i = i + 2) {
            f = 1;
            for (j = 1; j <= i; j++)
                f = f * j;
            sum = (float) (sum + s * (Math.pow(radian, i) / f));
            s = s * -1;
        }
        System.out.print("The value of sin(" + sine_term + ") is " + sum+"\n");

    }

    public void cosineSeries(int l, int cosine_term) {
        float no_of_terms = l;
        float radian = cosine_term;
        int i, j, f, s = 1;
        float sum = 0;
        radian = (float) (radian * 3.14159 / 180);
        for (i = 1; i <= no_of_terms; i = i + 2) {
            f = 1;
            for (j = 0; j <= i; j++)
                f = f * j;
            sum = (float) (sum + s * (Math.pow(radian, i) / f));
            s = s * -1;
        }
        System.out.print("The value of sin(" + cosine_term + ") is " + sum);
    }

    public static void main(String[] args) {
        ManySeries manySeries = new ManySeries();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number upto which you want even series:");
        int limit_even = sc.nextInt();
        manySeries.evenSeries(limit_even);

        System.out.println("\nEnter the number upto which you want odd series:");
        int limit_odd = sc.nextInt();
        manySeries.oddSeries(limit_odd);

        System.out.println("\nEnter the number upto which you want Fibonacci series:");
        int limit_fibonacci = sc.nextInt();
        manySeries.fibonacciSeries(limit_fibonacci);

        System.out.println("\nEnter the number of terms for which you want Sine Series:");
        int limit_sine_series = sc.nextInt();

        System.out.println("\nEnter the number value for which you want Sine series:");
        int sine_term = sc.nextInt();
        manySeries.sineSeries(limit_sine_series, sine_term);

        System.out.println("\nEnter the number of terms for which you want Cosine Series:");
        int limit_cosine_series = sc.nextInt();

        System.out.println("\nEnter the number value for which you want Cosine series:");
        int cosine_term = sc.nextInt();
        manySeries.sineSeries(limit_cosine_series, cosine_term);

    }
}