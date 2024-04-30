package university;

import java.util.Scanner;

public class University {
    String name;
    int size;
    Department[] darr;
    public University(String name, int size) {
        this.name = name;
        this.size = size;
        darr = new Department[size];
    }
    public void fillUniversity() {
        for (int i = 0; i < size; i++) {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Size of Department:");
            int size = sc.nextInt();
            System.out.println("Enter Name of Department:");
            String name = sc1.nextLine();

            Department d = new Department(name, size);
            darr[i] = d;
            darr[i].fillDepartment();
        }
    }
    public void displayUniversity() {
        System.out.println("Name of University: " + this.name);
        System.out.println("Number of Department in the University: " + this.size);
        System.out.println("Details of University: ");
        for (int i = 0; i < size; i++) {
            darr[i].displayDepartment();
        }
    }

}
