import java.util.ArrayList;

public class GenericArrayListDemo {
    // In Raw Array List There is a big draw back that we need to know which type of object(data) user has input
    // into the array list because there is not any specified data type mentioned while declaring Array list that
    // only integer or Float or Double type of data should be added to it.
    // When user can input any type of data into an Array list, and we don't know at what location what type of data is
    //stored, this results in problems while we try to access data from that Raw Array list as we need to know in
    // advance that at what location in Array list what type of data is stored. so that we can do type casting as
    // per the data in order to access it.
    // To avoid that we don't use Raw Array List we rather use Generic array List in which we defile in advance
    // at the time of declaration of Array List that what kind of data(integer, float, double etc.) it is going to
    // store. so because of that while accessing the data from that Generic Array list we can easily type cast it
    // as we know that only one kind of data is there in Array List.

    // Declaring the Generic Array list of type Integer
    // Here <Integer> is a type of Generics.

    public static void main(String[] args) {
        ArrayList<Integer> ArrLstInt1 = new ArrayList<Integer>();

        //Assigning Data to Generic ArrayList
        ArrLstInt1.add(2); //Autoboxing - automatically Creates Object of type Integer.
        ArrLstInt1.add(new Integer(3)); // or we can write it as Integer InOb1 = new Integer(2);
        ArrLstInt1.add(Integer.valueOf(4));

        // Printing values of our Generic Array List
        System.out.println("Values printed using println: " + ArrLstInt1 + "\n");

        System.out.println("Values printed using Enhanced For loop:\n");
        int i = 0;
        for (int val : ArrLstInt1) {
            System.out.println("Value at Index " + i + " is: " + val);
            i += 1;
        }

        System.out.println("\n"); // just for providing line spacing

        // Here as we can se we have totally avoided typecasting of objects  because we know that, only one
        // type of data is stored in our Generic Array List.

        // this Below type Casting can be completely avoided in case of Generic Array Lists
        System.out.println("Below are the values Printed using Type Casting \n");
        for (int j = 0; j < ArrLstInt1.size(); j++) {
            Integer IntVal = (Integer) ArrLstInt1.get(j); // Here we are type casting values to Integer type
            // contained in Array List ArrInt1
            System.out.println("Value Contained at Index " + j + " is: " + IntVal);
        }

        System.out.println("\n"); // just for providing line spacing

        System.out.println("Following Are Some Functions Performed on ArrayList ArrLstInt:\n");

        ArrLstInt1.remove(new Integer(3));
        System.out.println("After removal of 3 From Array List ArrLstInt1\n" + "Elements remaining in Array List ArrLstInt1 are: " + ArrLstInt1 + "\n");

        ArrLstInt1.remove(0);
        System.out.println("After removal of value at index 0 Of Array List ArrLstInt1\n" + "Elements remaining in Array List ArrLstInt1 are: " + ArrLstInt1);
    }


}
