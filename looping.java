// Demonstrate loop and conditional statements: for-loop,
// while loop, if-else condition, if-else, switch, break
// and continue statements.

import java.util.Scanner;

class All {

    void ForLoop() {
        for (int i = 1; i < 2; i++) {
            System.out.println("this is simple for loop");
        }
    }

    void WhileLoop() {
        int j = 1;
        while (j < 3) {
            System.out.println("This is a simple while loop");
            j++;
        }
    }

    void DoWhile() {
        int k = 1;
        do {
            System.out.println("condition is true in do while");
            k++;
        } while (k < 4);
    }

    void IfCondition() {
        int l = 1;
        if (l < 2) {
            System.out.println("This is from If condition");
        } else {
            System.out.println("This is from else condition");
        }
    }

    void IfElseCondition() {
        int m = 2;
        if (m < 2) {
            System.out.println("This statement is from If condition");
        } else if (m < 3) {
            System.out.println("This statement is from else if condition");
        } else {
            System.out.println("This statement is from else condition");
        }
    }

    void SwitchStatement() {
        Scanner take = new Scanner(System.in);
        System.out.println("enter your entry roll no.");

        int rollno = take.nextInt();
        switch (rollno) {
            case 10:
                System.out.println("Your name is Tavneet");
                break;
            case 9:
                System.out.println(" Your Name is Satya");
                break;
            default:
                System.out.println("Not in our records");
        }
    }

    void ContinueStatement() {
        int n = 1;
        while (n < 4) {
            if (n == 2) {
                n++;
                continue;
            }


            System.out.println("This from continue statement");
            n++;
        }
    }
}

class looping {
    public static void main(String[] args) {
        All a = new All();
        a.ForLoop();
        a.WhileLoop();
        a.DoWhile();
        a.IfCondition();
        a.IfElseCondition();
        a.ContinueStatement();
        a.SwitchStatement();

    }
}
