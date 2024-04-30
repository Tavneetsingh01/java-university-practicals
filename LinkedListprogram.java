import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListprogram {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("boy");
        linkedList.add("good");
        linkedList.add("a");
        linkedList.add("is");
        linkedList.add("Tavneet");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

}
