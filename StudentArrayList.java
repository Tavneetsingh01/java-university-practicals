import java.util.ArrayList;
import java.util.ListIterator;

public class StudentArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> StudentsName = new ArrayList<String>();
        StudentsName.add("Tavneet");
        StudentsName.add("Satya");
        StudentsName.add("Sundar");

        // Creating an instance of ListIterator
        ListIterator<String> iterate = StudentsName.listIterator(StudentsName.size());
        System.out.println("Iterating over Students name in reverse order:");
        while (iterate.hasPrevious()) {
            System.out.print(iterate.previous() + ", ");
        }
    }
}