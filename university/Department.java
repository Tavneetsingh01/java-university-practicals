package university;

import java.util.Scanner;

public class Department {
    String name;
    int size;
    Batch[] batcharr;

    public Department(String name, int size) {
        this.name = name;
        this.size = size;
        batcharr = new Batch[size];
    }

    public void fillDepartment() {
        for (int i = 0; i < size; i++) {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Size of Batch");
            int size = sc.nextInt();
            System.out.println("Enter Name of Batch");
            String name = sc1.nextLine();

            Batch b = new Batch(name, size);
            batcharr[i] = b;
            batcharr[i].fillBatch();
        }
    }

    public void displayDepartment() {
        System.out.println("Name of Department: " + this.name);
        System.out.println("Number of Batches in the Department: " + this.size);
        System.out.println("Batches Details in Department: ");
        for (int i = 0; i < size; i++) {
            batcharr[i].displayBatch();
        }
    }
}
