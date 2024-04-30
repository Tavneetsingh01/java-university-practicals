import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    int price;
    public static void main(String[] args) {

        Stack<String> St1 = new Stack<String>();
        St1.push("S");
        St1.push("M");
        St1.push("V");
        St1.push("D");
        St1.push("U");
        St1.push(" ");
        St1.push("U");
        St1.push("N");
        St1.push("I");
        St1.push("V");

        St1.pop(); // this will pop pot last entered item which is "V" here from stack St1

        System.out.println("Accessing Stack using Println: " + St1); // here when we do println on St1 stack .toString()
        // function of Stack St1 gets called.
        // Due to that System.out.println("Accessing Stack USing Println :"+ St1.toString(); and the above statement both
        // does the same thing.

        // Now we are accessing the values of Stack St1 using Iterator interface by creating reference variable
        // of Iterator interface and then points it to the subclass Object which is St1.iterator() here.
        // we can only make references of interfaces.
        // parent class reference always point to a subclass object;
        System.out.println("Values Fetched from Stack using Iterator Interface are :");

        Iterator<String> itr1 = St1.iterator(); // itr is the Reference variable of interface Iterator;
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }



        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        //vBy using final keyword as : public final class Test{ }

    //}
    }

}
