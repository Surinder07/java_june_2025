package jul15;

public class Student {

    String name;
    int rollNo;
    int maths;
    int physics;
    int biology;

    public double getAverage(int maths, int physics, int biology){
        double average =  (maths + physics + biology)/3;
        return average;
    }

    public String getGrade(double average){
        if(average >= 90 ) return "A";
        else if (average >= 70 && average < 90) return "B";
        else return "C";
    }

    public static void main(String[] args) {

        Student student = new Student();

        // user input
        double average = student.getAverage(50, 70, 80);
        String grade = student.getGrade(average);

        // move to another method
        student.name = "Jatin";
        student.rollNo = 10001;
        System.out.println("Name " + student.name);
        System.out.println("Roll no  " + student.rollNo);
        System.out.println("Grade " + grade);
    }


}


/*


## Problem statement
 class Student
1. Name
2. rollNo
3. marks1, marks2, marks3

method()
getGrade(){

// based on marks, return the grade.
}
Marks : 50 60 80 ---- total
calculate the average
based on the average , return the grade.
avg > 90 -- A
avg 70  and 90 --- B
avg less than 70 --- C


 */