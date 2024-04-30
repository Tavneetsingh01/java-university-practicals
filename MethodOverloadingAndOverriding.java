import java.util.Scanner;

class Python {
    void hello() {
        System.out.println("Hello From Python Class");
    }
}

class DotNet extends Python {
    void hello() {
        System.out.println("Hello From Dotnet Class");
    }
}

class AirthmeticOverloading {
    public void multiply(int a, int b) {
        System.out.println("Multiplication of two entered integer numbers gives us: " + (a * b));
    }

    public void multiply(double a, double b) {
        System.out.println("Multiplication of two entered decimal numbers gives us: " + (a * b));
    }
}


public class MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        AirthmeticOverloading airthmeticOverloading = new AirthmeticOverloading();

        Python p = new Python();

        DotNet m = new DotNet();

        Python ref; // refrence object of python class

        ref = p;  //refrence points to the python object

        ref.hello(); // calling the hello function present in python class

        ref = m; // refrence points to the dotnet object

        ref.hello(); // calling the hello function present in dotnet calss

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter any two integer values for multiplication: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        airthmeticOverloading.multiply(a, b);

        System.out.println("\nEnter any two decimal values for multiplication: ");
        double da = sc.nextDouble();
        double db = sc.nextDouble();
        airthmeticOverloading.multiply(da, db);
    }
}
