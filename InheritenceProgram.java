interface dev {
    public void devnews();
}

class windows {
    void news() {
        System.out.println("Windows 11 is launched");
    }
}

class microsoft extends windows implements dev {
    public void devnews() {
        System.out.println("DotNet 6.0 hits General availability");
    }

}

public class InheritenceProgram {
    public static void main(String[] args) {

        microsoft M = new microsoft(); // M is the obect of Microsoft class

        M.devnews(); // calls devnews() function

        M.news();  // calls news method

    }
}


