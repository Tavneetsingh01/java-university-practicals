import java.util.Arrays;
import java.util.Objects;

public class ComparableClassDemo {
    public static void main(String[] args) {
        Employee Emp1 = new Employee("Tavneet", 89000.00); // here as we are providing parameters while making
        Employee Emp2 = new Employee("Amit", 85000.00);    // objects of our Employee Class, so we are invoking
        Employee Emp3 = new Employee("Jasmeet", 83000.00); // parameterized constructor of Employee Class

        System.out.println(Emp1);// here by default the toString Function gets called on the object to which this
        // reference variable points. Here we have overwritten the default toString() function. so now when we
        // call the reference of an object of class Employee. our implementation of toString() function gets executed.

        System.out.println("Is the salaries of Employee 1 and 2 are equal: " + Emp1.equals(Emp3) + "\n"); // Compares 2 objects on the basis of condition specified in .equals()
        // function.
        // Here we have compared two objects  on the basis of their salaries and checked weather their salaries are equal or not.

        System.out.println("Hash Code of Name of Employee 1 is: " + Emp1.hashCode() + "\n");
        System.out.println("Hash Code of Name of Employee 2 is: " + Emp2.hashCode() + "\n");


        Employee[] EmpArr = new Employee[3]; // here we have defined Array of Employee references 
        EmpArr[0] = Emp1;                    // that points to object of type Employee.
        EmpArr[1] = Emp2;
        EmpArr[2] = Emp3;

        Arrays.sort(EmpArr); //Sorts the specified array of objects into ascending order, according to the
        // natural ordering of its elements. All elements in the array must implement the Comparable interface.
        // Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) must
        // not throw a ClassCastException for any elements e1 and e2 in the array).
        // This sort is guaranteed to be stable: equal elements will not be reordered as a result of the sort.

        //System.out.println("List Of Employees Sorted On the Basis of Salary is: \n" + Arrays.toString(EmpArr));
        System.out.println("List Of Employees Sorted On the Basis of Salary is:");
        for (Employee EmpVal : EmpArr) { // Here this for loop takes one reference variable from the  EmpArr and assign
            // it to another reference variable EmpVal of type Employee, and then we use this Ref Variable
            // to fetch a particular object's  name and salary
            System.out.println(EmpVal.name + " : " + EmpVal.salary);
        }
    }
}

class Employee implements Comparable<Employee> {

    String name;
    Double salary;


    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary; // Here this keyword is used to get the variables defined in main class Employee.
    }

    @Override
    public String toString() {
        return this.name + ", " + this.salary;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Employee OtherObject) {
        if (this.salary > OtherObject.salary) {
            return 1;
        } else if (this.salary < OtherObject.salary) {
            return -1;
        } else {
            return 0;
        }
        // we can write the above lines of code / logic In the below format as well
        //return this.salary.compareTo(OtherObject.salary);
    }

    @Override
    public boolean equals(Object OtherObject) {
        Employee OtherEmpObject = (Employee) OtherObject; // here we are type casting the reference variable to its actual object.
        return Objects.equals(this.salary, OtherEmpObject.salary);
    }
}