package university;

import java.util.Scanner;

public class Batch {
    String name;
    int size;
    UniversityStudent[] stuarr;

    public Batch(String name, int size) {
        this.name = name;
        this.size = size;
        stuarr = new UniversityStudent[size];
    }

    public void fillBatch() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int k =1;
        for (int i = 0; i < size; i++) {
            stuarr[i] = new UniversityStudent();
            System.out.println("\nEnter Roll NO of ("+ k +") student");
            String rollNo = sc1.nextLine();
            System.out.println("Enter name of ("+ k +") student");
            String name = sc1.nextLine();
            System.out.println("Enter Age of("+ k +") of student");
            int age = sc2.nextInt();
            stuarr[i].setRoll(rollNo);
            stuarr[i].setName(name);
            stuarr[i].setAge(age);
            k++;
        }
    }

    public void displayBatch() {
        System.out.println("\nName of Batch " + this.name);
        System.out.println("Number of students in the batch " + this.size);
        System.out.println("\nStudents Details in Batch ");
        for (UniversityStudent s : stuarr) {
            System.out.println(" Roll No of student is " + s.getRoll());
            System.out.println(" Name of student is " + s.getName());
            System.out.println(" Age of student is" + s.getAge());
        }
    }
}


