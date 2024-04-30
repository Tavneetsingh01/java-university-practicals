import java.util.Scanner;

// enum of type Planet
enum Planet {
    MERCURY  (3.303e+23, 2.4397e6),
    VENUS    (4.869e+24, 6.0518e6),
    EARTH    (5.976e+24, 6.37814e6),
    MARS     (6.421e+23, 3.3972e6),
    JUPITER  (1.9e+27,   7.1492e7),
    SATURN   (5.688e+26, 6.0268e7),
    URANUS   (8.686e+25, 2.5559e7),
    NEPTUNE  (1.024e+26, 2.4746e7),
    PLUTO    (1.27e+22,  1.137e6);

    // mass is in Kg
    private final double mass;

    //radius of planet is in meter
    private final double radius;

    /*This below constructor is the private
    constructor of enum Planet here*/
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    /*These below functions return the mass
     and radius of every Planet in emun Planet*/
    public double mass() {
        return mass;
    }

    public double radius() {
        return radius;
    }

    //universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}

// Main driver program
public class EnumeratedProgram {
    public static void main(String[] args) {
        System.out.println("Enter you weight on here on Earth:");
        Scanner sc = new Scanner(System.in);
        double weight_on_earth = sc.nextDouble();

        double mass = weight_on_earth / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Your weight on " + p + " is " + p.surfaceWeight(mass) + "\n");
        }
    }
}
