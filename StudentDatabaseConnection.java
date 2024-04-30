import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabaseConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_students", "root", "");
        System.out.println("\nConnection string is " + conn.toString());
        System.out.println("\nHow many records you want to enter into the table: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            Scanner scname = new Scanner(System.in);
            Scanner scrollno = new Scanner(System.in);
            System.out.println("\nEnter the name for (" + i + ") record: ");
            String inpName = scname.nextLine();
            System.out.println("Enter the rollno for (" + i + ") record: ");
            int inpRollno = scrollno.nextInt();

            String name = "\"" + inpName + "\"";
            int rollno = inpRollno;

            String query = "INSERT into students VALUES (" + name + "," + rollno + ");";
            System.out.println(i + " Query is :" + query);
            Statement st = conn.createStatement();
            int val = st.executeUpdate(query);

            System.out.println(i + " record added");
        }

        conn.close();

    }
}
