package sep2;

public class Student {
    private static final Student obj = new Student();

    private Student(){

    }

    public static Student getInstance(){
        return obj;
    }
}
