import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListObjects {
    public static void main(String[] args) {

        ArrayList<Students> studentsArrayList = new ArrayList<Students>();

        Students student1 = new Students("Tavneet singh", 10, 13);
        Students student2 = new Students("Satya", 01, 13);
        Students student3 = new Students("Sundar", 02, 13);

        studentsArrayList.add(student1);
        studentsArrayList.add(student2);
        studentsArrayList.add(student3);

        System.out.println("Entered Records are:");
        int i = 1;
        for (Students student : studentsArrayList) {
            System.out.println(i + ") Student details are: " + "Name:" + student.Name + " Rollno.:" + student.Rollno + " Class:" + student.Classno);
            i++;
        }


    }
}