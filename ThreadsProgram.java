public class ThreadsProgram {
    public static void main(String args[]) {

        Thread1 m1 = new Thread1();
        m1.start();
        Thread2 m2 = new Thread2();
        m2.start();
        Thread3 m3 = new Thread3();
        m3.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1");
        int n1 = 0, n2 = 1, n3, i, count = 1000;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        try {
            this.sleep(100);
        } catch (InterruptedException ex) {
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread2");
        int n;
        int status = 1;
        int num = 3;
        n = 1000;
        if (n >= 1) {
            System.out.println(2);
        }
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
        try {
            this.sleep(100);
        } catch (InterruptedException ex) {
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread3");
        for (int number = 0; number < 1000; number++) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
        try {
            this.sleep(100);
        } catch (InterruptedException ex) {
        }
    }
}
