package university;

import java.util.Scanner;

public class Final {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Number of Universities");
        int size = sc1.nextInt();
        System.out.println("Enter Name of University");
        String name = sc.nextLine();
        University u = new University(name, size);
        u.fillUniversity();
        u.displayUniversity();

    }
}
