import java.util.Scanner;

public class OperatorsProgram {
    public void urinaryOperator(double n) {
        int a = 6, b = -6;
        boolean bool = true;
        System.out.println("Incrementing Entered value by one(+1) by using urinary operator n++ (postfix ++): " + n++);
        System.out.println("Decrementing Entered value by one(-1) by using urinary operator n-- (postfix --): " + n--);
        System.out.println("Incrementing Entered value by one(+1) by using urinary operator ++n (prefix ++): " + ++n);
        System.out.println("Decrementing Entered value by one(-1) by using urinary operator --n (prefix --): " + --n);

        System.out.println("\nApplying ~ operator on " + a + " gives value: " + ~a);
        System.out.println("Applying ~ operator on " + b + " gives value: " + ~b);

        System.out.println("\nApplying ! operator on boolean variable bool having value \"" + bool + "\" gives value \"" + !bool + "\"");
    }

    public void airthmeticOperator(double a, double b) {
        System.out.println("Applying + Airthmetic operator on " + a + " and " + b + " gives us value:" + (a + b));
        System.out.println("Applying - Airthmetic operator on " + a + " and " + b + " gives us value:" + (a - b));
        System.out.println("Applying * Airthmetic operator on " + a + " and " + b + " gives us value:" + (a * b));
        System.out.println("Applying / Airthmetic operator on " + a + " and " + b + " gives us value:" + (a / b));
        System.out.println("Applying % Airthmetic operator on " + a + " and " + b + " gives us value:" + (a % b));
    }

    public void logicalAndBitwiseOperator(double a, double b) {
        System.out.println("Applying logical operator && on a and b for(a>5&&b>=5)" + (a > 5 && b >= 5));
        System.out.println("Applying logical operator & on a and b for(a>5&b>=5)" + (a > 5 & b >= 5));

        System.out.println("\nApplying logical operator || on a and b for(a>5||b>=5)" + (a > 5 || b >= 5));
        System.out.println("Applying logical operator | on a and b for(a>5|b>=5)" + (a > 5 | b >= 5));
    }

    public void ternaryOperator(double a, double b) {
        System.out.println("Applying ternary operator ? condition on a and b for(a>b?a:b) " + "\nThen max of a and b is " + (a > b ? a : b));
        System.out.println("Applying ternary operator ? condition on a and b for(a<b?a:b) " + "\nThen min of a and b is " + (a < b ? a : b));
    }

    public void assignmnetOperator(double a, double b) {
        System.out.println("\nApplying assignment operator on a via(a+=7) " + (a += 7));
        System.out.println("Applying assignment operator on a via(b-=5) " + (b -= 5));

    }

    public static void main(String[] args) {
        System.out.println("Enter any number on which you want to apply Urinary operators:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        OperatorsProgram operatorsProgram = new OperatorsProgram();
        operatorsProgram.urinaryOperator(num);

        System.out.println("\nEnter any number on which you want to apply Arithmetic,logical, bitwise, ternary and assignment operators:");
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        operatorsProgram.airthmeticOperator(a, b);
        operatorsProgram.logicalAndBitwiseOperator(a, b);
        operatorsProgram.ternaryOperator(a, b);
        operatorsProgram.assignmnetOperator(a, b);
    }
}
