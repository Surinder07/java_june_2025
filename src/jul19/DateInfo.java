package jul19;

public class DateInfo {

    // instance variables
    int day;
    int month;
    int year;


    DateInfo(){
        System.out.println("Default constructor ");
    }

    public DateInfo(int day) {
        this.day = day;
    }

    public DateInfo(int day, int month) {
        this(10,20,2025); // this() has to be the first statement in the constructor body
        System.out.println("Param constructor ");
        this.day = day;
        this.month = month;
    }

    // this
    public DateInfo(int day, int month, int year) {
        System.out.println("3 param");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate(){
        int day = 1000001; // local variable
        System.out.println(this.day + "/"+ month + "/" + year);
    }
}
