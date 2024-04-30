import java.util.Scanner;


    import java.util.Scanner;

    class SMVDUException1 extends Exception {
        public SMVDUException1(String str) {

            super(str);
        }
    }

class SMVDUException2 extends Exception {
    public SMVDUException2(String str) {

        super(str);
    }
}

public class CustomStudentsException {
        public static void main(String args[]) throws SMVDUException1,SMVDUException2 {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the details of the students for M.Tech ");
            System.out.println("Enter Percentage: ");
            int per = sc1.nextInt();
            System.out.println("Enter Percentage: ");
            String ugc = sc2.nextLine();
            int reqper = 60;
            String requgc1 = "cse";
            String requgc2 = "it";

            if (per<=reqper) {
                try {
                    throw new SMVDUException1("Percentage not met");

                } catch (SMVDUException1 ex) {
                    System.out.println(ex.getMessage());
                }

            } else if (per>reqper) {
                try {

                    throw new SMVDUException2("Condition met");

                } catch (SMVDUException2 ex) {
                    System.out.println(ex.getMessage());
                }
            }

                else if (!(ugc.equals(requgc1) ||ugc.equalsIgnoreCase(requgc2))) {
                try {

                    throw new SMVDUException2("Condition not met");

                } catch (SMVDUException2 ex) {
                    System.out.println(ex.getMessage());
                }
            }
                    else if (ugc.equals(requgc1) ||ugc.equalsIgnoreCase(requgc2)){
                        try {

                            throw new SMVDUException2("Condition met");

                        } catch (SMVDUException2 ex) {
                            System.out.println(ex.getMessage());
                        }


                System.out.println("Out Of Exception");
            }

        }
    }

