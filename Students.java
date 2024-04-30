public class Students {
    String Name;
    int Rollno;
    int Classno;

    public Students() {
    }

    Students(String Name, int Rollno, int Class) {
        this.Name = Name;
        this.Rollno = Rollno;
        this.Classno = Class;

    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }

    public void setClassno(int Classno) {
        this.Classno = Classno;
    }

    public String getName() {
        return this.Name;
    }

    public int getRollno() {
        return this.Rollno;
    }

    public int getClassno() {
        return this.Classno;
    }
}
