import java.math.*;
import java.util.Scanner;

public class BigIntDecDemo {
    public static void main(String[] args) {
        System.out.println("Enter the first big integer:");
        Scanner binte1 = new Scanner(System.in);
        String s1 = binte1.nextLine();
        s1 = s1.trim();

        BigInteger Bi1 = new BigInteger(s1);

        System.out.println("Enter the second big integer:");
        Scanner binte2 = new Scanner(System.in);
        String s2 = binte2.nextLine();
        s2 = s2.trim();

        BigInteger Bi2 = new BigInteger(s2);

        System.out.println("\nMultiplication of entered numbers is " + Bi2.multiply(Bi1));
        System.out.println("Addition of entered numbers is " + Bi2.add(Bi1));
        // big decimal demo

        System.out.println("\nEnter the first big decimal:");
        Scanner bdec1 = new Scanner(System.in);
        String s3 = bdec1.nextLine();
        s3 = s3.trim();

        BigDecimal Bd1 = new BigDecimal(s3);

        System.out.println("Enter the second big decimal:");
        Scanner bdec2 = new Scanner(System.in);
        String s4 = bdec2.nextLine();
        s4 = s4.trim();

        BigDecimal Bd2 = new BigDecimal(s4);

        System.out.println("\nMultiplication of entered numbers is " + Bd2.multiply(Bd1));
        
        System.out.println("Addition of entered numbers is " + Bd2.add(Bd1));
    }
}