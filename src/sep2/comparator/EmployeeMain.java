package sep2.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Mike", 20543));
        list.add(new Employee(105, "Peter", 324435));
        list.add(new Employee(103, "John", 23252));
        list.add(new Employee(102, "Bob", 45323));
        list.add(new Employee(106, "Mark", 53422));

        /*Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });*/
       // list.sort(Comparator.comparing(Employee::getName));  // this is to be used in Java 8 and above
        System.out.println("Order based on name : "+list);

        list.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        Collections.sort(list, new SalaryComparator());

        System.out.println("Order based on salary : "+list);
    }
}
