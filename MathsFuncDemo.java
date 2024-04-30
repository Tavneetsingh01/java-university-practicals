import java.util.Scanner;


public class MathsFuncDemo {
 
    public static void main(String[] args){
        Scanner sca1 = new Scanner(System.in);
        System.out.println("Enter the first numerical value");
   
        Double val1 = sca1.nextDouble();

        Scanner sca2 = new Scanner(System.in);
        System.out.println("Enter the second numerical value");
   
        Double val2 = sca2.nextDouble();

        System.out.println("\nFollowing are some of the functions provided by Math Class:");

        System.out.println("Smallest of two entered numbers is: "+ Math.min(val1, val2));

        System.out.println("largest of two entered numbers is: "+ Math.max(val1, val2));

        System.out.println("\nCube root of "+ val1 +" number is: " + Math.cbrt(val1));
        
        System.out.println("Cube root of "+ val2 +" number is: " + Math.cbrt(val2));

        System.out.println("\nSquare root of "+ val1 +" number is: " + Math.sqrt(val1));

        System.out.println("Square root of "+ val1 +" number is: " + Math.sqrt(val2));

        System.out.println("\nlog of the "+ val1+" is: "+ Math.log(val1));
       
        System.out.println("log of the "+ val2+" is: "+ Math.log(val2));

        System.out.println("\nlog to value 10 of "+ val1+" is: "+ Math.log10(val1));

        System.out.println("log to value 10 of "+ val2+" is: "+ Math.log10(val1));

        System.out.println("\nNatural log of the sum of the argument and 1 of "+ val1+" is: "+ Math.log1p(val1));

        System.out.println("Natural log of the sum of the argument and 1 of "+ val2+" is: "+ Math.log1p(val2));

        System.out.println("\n"+val1+" Raised to the power of "+val2+" is: "+ Math.pow(val1,val2));

        System.out.println("\nExponential of "+val1+" is "+ Math.getExponent(val1));

        System.out.println("Exponential of "+val2+" is "+ Math.getExponent(val2));

        System.out.println("\nExp of "+val1+" is "+ Math.exp(val1));

        System.out.println("Expm1 of "+val1+" is "+ Math.expm1(val1));

        System.out.println("\nTrigonometric functions provided by Maths class:");

        System.out.println("sin values of "+val1+" and "+val2+"are: "+ Math.sin(val1)+" and "+Math.sin(val2)+" respectively.");

        System.out.println("cosine values of "+val1+" and "+val2+" are: "+ Math.cos(val1)+" and " +Math.cos(val2)+" respectively.");

        System.out.println("tan values of "+val1+" and "+val2+" are: "+ Math.tan(val1)+" and "+Math.tan(val2)+" respectively.");

        System.out.println("\narc sin values of "+val1+" and "+val2+"a re: "+ Math.asin(val1)+" and "+Math.asin(val2)+" respectively.");

        System.out.println("arc cosine values of "+val1+" and "+val2+" are: "+ Math.acos(val1)+" and "+Math.acos(val2)+" respectively.");

        System.out.println("arc tan values of "+val1+" and "+val2+" are: "+ Math.atan(val1)+" and "+Math.atan(val2)+" respectively.");

        System.out.println("\nsinh values of "+val1+" and "+val2+" are: "+ Math.sinh(val1)+" and "+Math.sinh(val2)+" respectively.");

        System.out.println("cosineh values of "+val1+" and "+val2+" are: "+ Math.cosh(val1)+" and "+Math.cosh(val2)+" respectively.");

        System.out.println("tanh values of "+val1+" and "+val2+" are: "+ Math.tanh(val1)+" and "+Math.tanh(val2)+" respectively.");
    }
    
}
