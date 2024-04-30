// Dynamic method dispatch in java
class OpenPython {
    void hello() {
        System.out.println("Hello From Python Class");
    }
}

class OpenDotNet extends OpenPython {
    void hello() {
        System.out.println("Hello From Dotnet Class");
    }
}

public class ReferenceVar {
    public static void main(String[] args) {
        OpenPython p = new OpenPython();

        OpenDotNet m = new OpenDotNet();

        OpenPython ref; // refrence object of python class

        ref = p;  //refrence points to the python object

        ref.hello(); // calling the hello function present in python class

        ref = m; // refrence points to the dotnet object

        ref.hello(); // calling the hello function present in dotnet calss
    }
}
