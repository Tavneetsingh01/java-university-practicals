// Demonstrate the use of primitive datatypes available
// in Java and conversion between them using typecasting
// (if possible) to understand lossy/non-lossy conversions.
public class PremitiveDataTypes {
    public static void main(String[] args) {
        int int_var = 45;
        int int_var_b = 20;
        double double_var = 148.597545d;
        double double_var_b = 24.4785d;
        long long_var = 98785954;
        long long_var_b = 874581146;
        float float_var = 2.718f;
        float float_var_b = 3.1415926f;
        byte byte_var = 112;
        byte byte_var_b = 12;
        short short_var = 7777;
        short short_var_b = 451;
        char char_var_unicode = 84;
        char char_var_alphabet = 'a';
        boolean boolean_var = true;

        System.out.println("Usage of int Primitive Data type by doing Arithmetic Operations on it\n1) Addition on int: " + (int_var + 1) + "\n 2) Subtraction on int: " + (int_var - 2) + "\n 3) Multiplication on int: " + (int_var * int_var_b) + "\n 4) Division on int: " + (int_var / int_var_b) + "\n");
        System.out.println("Usage of double Primitive Data type  by doing Arithmetic Operations on it\n1) Addition on double: " + (double_var + double_var_b) + "\n 2) Subtraction on double: " + (int_var - 2.48d) + "\n 3) Multiplication on double: " + (double_var * double_var_b) + "\n 4) Division on double: " + (double_var / double_var_b) + "\n");
        System.out.println("Usage of float Primitive Data type  by doing Arithmetic Operations on it\n1) Addition on float: " + (float_var + float_var_b) + "\n 2) Subtraction on float: " + (float_var - 24.4845f) + "\n 3) Multiplication on float: " + (float_var * float_var_b) + "\n 4) Division on float: " + (float_var / float_var_b) + "\n");
        System.out.println("Usage of long Primitive Data type  by doing Arithmetic Operations on it\n1) Addition on long: " + (long_var + long_var_b) + "\n 2) Subtraction on long: " + (int_var - int_var_b) + "\n 3) Multiplication on long: " + (double_var * double_var_b) + "\n 4) Division on double: " + (long_var / long_var_b) + "\n");
        System.out.println("Byte can oly hold value from -128 to 127\n All Airthmetic operations can be applied on byte data type:\n" + "1) Addition on byte: " + (byte_var + byte_var_b) + "\n 2) Subtraction on byte: " + (byte_var - byte_var_b) + "\n 3) Multiplication on byte: " + (byte_var * byte_var_b) + "\n 4) Division on Byte: " + (byte_var / byte_var_b) + "\n");
        System.out.println("Short data type is half the size of int and twice the size of byte data type\nUsage of short Primitive Data type  by doing Arithmetic Operations on it\n 1) Addition on double: " + (short_var + 4584) + "\n 2) Subtraction on short: " + (short_var - short_var_b) + "\n 3) Multiplication on short: " + (short_var * short_var_b) + "\n 4) Division on short: " + (short_var / short_var_b) + "\n");
        System.out.println("char data type is a 16-bit integer representing a Unicode-encoded character (eg: \\u0045 for char C = 45)\n" + "Operations on Char datatype:\n" + "1)Normal printing value of char variable (Unicode): " + char_var_unicode + "\n 2) Normal printing value of char variable (containing normal character):" + char_var_alphabet + "\n 3)Printing value of char variable (Unicode by incrementing it):" + (char_var_unicode + 2) + "\n");
        System.out.println("Boolean is used to control flow of program.\n Boolean only have two values true and false");
        if (boolean_var == true) {
            System.out.println("Here value of Boolean variable is: " + boolean_var + "\n");
            boolean_var = false;
        }
        System.out.println("Here we have change the value of Boolean variable and have set it to " + boolean_var + "\n");
        System.out.println("Now take a look at type casting primitive data types\n");
        System.out.println("There are two types of type casting:\n 1) Downcasting or Narrowing Type Casting \n 2) Widening Type Casting\n");
        System.out.println("In Downcasting we convert a higher primitive datatype like int into lower datatype like short or byte primitive datatype or from double to int, etc.\n" + "In this we loose some information as the datatype to which we are converting to doesn't have that much of Space to store all the information.\n");
        System.out.println("Example of Downcasting/ loosy Conversion:");
        System.out.println("Converting double to int:\n" + "Double value: "+double_var+"\nConverted int value: "+((int) double_var));
        System.out.println("Converting int to byte:\n"+"Int value: "+((int)double_var)+"\nConverted byte value: "+((byte)((int) double_var))+"\n");
        System.out.println("In Widening Type Casting we convert a lower primitive datatype like int into higher datatype like double or from datatype byte to int.\n" + "In this we dont loose any information as the datatype to which we are converting to much extra Space to store all the information.\n");
        System.out.println("Example of Widening/ non-loosy Conversion:");
        System.out.println("Converting int to double:\n" + "Int value: "+int_var+"\nConverted Double value: "+((double) int_var));
        System.out.println("Converting short to int:\n"+"Short Value: "+short_var+"\nConverted Short Value: "+((int)short_var));
    }
}
