import java.util.Scanner;

class SMVDUException extends Exception {
    public SMVDUException(String str) {

        super(str);
    }
}

public class CustomException {
    public static void main(String args[]) throws SMVDUException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String a = sc.nextLine();
        String b = "SMVDU";
        String c = "university";
        if (a.equals(b)) {
            try {
                throw new SMVDUException("SMVDU Exception");

            } catch (SMVDUException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Out Of Exception");

        } else if (a.equals(c)) {
            try {
                throw new SMVDUException("Univerrsity Exception");

            } catch (SMVDUException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Out Of Exception");
        }

    }
}