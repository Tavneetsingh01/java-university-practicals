import java.util.*;

public class StudentHashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();// Q

        System.out.println("Enter the size of your class:");
        Scanner si = new Scanner(System.in);
        int size = si.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter the student id:");
            Scanner sid = new Scanner(System.in);
            int id = sid.nextInt();

            System.out.println("\nEnter the student CGPA:");
            Scanner scgpa = new Scanner(System.in);
            int cgpa = scgpa.nextInt();
            hm.put(id, cgpa);
        }

        System.out.println("\nEntered details:");

        System.out.println(hm);
    }
}
