class Ms {
    private void dev() { // only available to the class Microsoft
        System.out.println("Visual studio 2022 new preview has been released.");
    }

    public void xbox() {
        System.out.println("Xbox series X and S has been launched");
    }

    protected void security() { // cn be acced within same package or in the subclasses of same package
        System.out.println("windows defender ATP service version: ");
    }

    void azure() { // when no access specifier is mentioned it is default specifier.
        System.out.println("The main business of microsoft is MS Azure Cloud");
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        Ms microsoft = new Ms();
        //microsoft.dev(); //not possible here because dev() function has private access specifier on it.
        microsoft.xbox();
        microsoft.security();
        microsoft.azure();

    }
}
