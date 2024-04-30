import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        // in set we cannot add duplicate values
        // Tree set is sorted set.
        // In tree set The elements are ordered using their natural ordering,
        // or by a Comparator provided at set creation time, depending on which constructor is used.
        TreeSet<String> Ts = new TreeSet<String>();
        Ts.add("S");
        Ts.add("M");
        Ts.add("V");
        Ts.add("D");
        Ts.add("U");
        Ts.add("U");
        Ts.add("N");
        Ts.add("I");
        Ts.add("V");

        System.out.println("Elements in tree set (accessed via Println) are:" + Ts + "\n");

        System.out.println("Elements in tree set (accessed via Iterator interface) are:");
        Iterator<String> itr3 = Ts.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Linked Hash Set and Hash Set Both Maintains the Order in which elements are added to the set and also
        // No duplication of Entries are allowed in all three variants of set;
        LinkedHashSet<String> Lhs = new LinkedHashSet<String>();
        Lhs.add("S");
        Lhs.add("M");
        Lhs.add("V");
        Lhs.add("D");
        Lhs.add("U");
        Lhs.add("U");
        Lhs.add("N");
        Lhs.add("I");
        Lhs.add("V");

        System.out.println("Elements in Linked Hash Set (accessed via Println) are:" + Lhs + "\n");

        System.out.println("Elements in Linked Hash set (accessed via Iterator interface) are:");
        Iterator<String> itr4 = Lhs.iterator();
        while (itr4.hasNext()) {
            System.out.println(itr4.next());
        }

        HashSet<String> Hs = new HashSet<String>();
        Hs.add("S");
        Hs.add("M");
        Hs.add("V");
        Hs.add("D");
        Hs.add("U");
        Hs.add("U");
        Hs.add("N");
        Hs.add("I");
        Hs.add("V");

        System.out.println("Elements in Hash Set (accessed via Println) are:" + Hs + "\n");

        System.out.println("Elements in Hash set (accessed via Iterator interface) are:");
        Iterator<String> itr5 = Hs.iterator();
        while (itr5.hasNext()) {
            System.out.println(itr5.next());
        }

    }
}
