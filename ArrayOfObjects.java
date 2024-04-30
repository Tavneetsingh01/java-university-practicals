
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Students[] StudArray; // Here we have Declared array of references of type Students.
        // Here that StudArray contains the references that pont to objects of type students.

        System.out.println("Enter how many numer of students Record do you want to enter:");

        Scanner srcn = new Scanner(System.in);
        int sno = srcn.nextInt();

        StudArray = new Students[sno]; // here we are assigning size/memory to our array of references of type students.

        System.out.println("Enter the record of " + sno + " students one by one:");

        Scanner Sname = new Scanner(System.in);
        Scanner Sroll = new Scanner(System.in);
        Scanner Sclass = new Scanner(System.in);

        for (int i = 0; i < sno; i++) {
            StudArray[i] = new Students(); //Here actual object of type Students gets created
            // and the reference variable StudArray[1] in cae of first iteration of for loop points to that students object.
            System.out.println("\nEnter the name of " + (i + 1) + " student: ");
            String NameOfStudent = Sname.nextLine();
            StudArray[i].setName(NameOfStudent); //Here we have used Setter function of Students object which is .setName()
            // to set the name of student.

            System.out.println("Enter the Roll Number of " + (i + 1) + " student: ");
            int RollnoOfStudent = Sroll.nextInt();
            StudArray[i].setRollno(RollnoOfStudent);//Here we have used Setter function of Students object which is.setRollno()
            // to set the name of student.

            System.out.println("Enter the Class of " + (i + 1) + " student: ");
            int ClassOfStudent = Sclass.nextInt();
            StudArray[i].setClassno(ClassOfStudent);//Here we have used Setter function of Students object which is.setClassno()
            // to set the name of student.
        }

        System.out.println("Records Entered by You are: \n");

        int i = 1;
        for (Students S : StudArray) {
            System.out.println("Name of " + i + " Student: " + S.getName());
            System.out.println("Roll no of " + i + " Student: " + S.getRollno());
            System.out.println("Class of " + i + " Student: " + S.getClassno());
            i += 1;

            /*Here above we have used three Getter functions of Students object which is .getName(), .getRollno(), .getClassno()
             to get the name, roll number, Class of the students. */

        }

    }
}
