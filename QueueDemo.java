import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue is a First in First Out type Data Structure
        PriorityQueue<String> Pq1 = new PriorityQueue<String>();
        Pq1.add("S");
        Pq1.add("M");
        Pq1.add("V");
        Pq1.add("D");
        Pq1.add("U");
        Pq1.add("U");
        Pq1.add("N");
        Pq1.add("I");
        Pq1.add("V");

        System.out.println("Values in Queue Before removing a  value from it:\n" + Pq1);

        Pq1.remove(); // removing First value fom queue
        System.out.println("Values in Queue After removing a value from it:\n" + Pq1.toString());


        System.out.println("Accessing Values of Queue After removing any value from it (By Using ITERATOR INTERFACE):\n");
        Iterator itr2 = Pq1.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


    }
}
