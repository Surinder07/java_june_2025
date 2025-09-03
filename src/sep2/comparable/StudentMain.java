package sep2.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jatin", 90));
        studentList.add(new Student("Divyanshu", 94));
        studentList.add(new Student("Gurjit", 99));
        studentList.add(new Student("Palak", 92));

        Collections.sort(studentList);
        System.out.println(studentList);

        // 0 - both objects are equal
        // -1 current object is less than the other object
        // 1 current is greater than other object


    }
}
