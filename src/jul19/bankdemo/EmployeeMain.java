package jul19.bankdemo;

import jul19.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Jatin", 20234000.23);
        employee1.printEmployeeDetails();

        Employee employee2 = new Employee(102, "Divyanshu", 230000.23);
        employee2.printEmployeeDetails();

        Employee employee3 = new Employee(103, "Vrunda", 260000.23);
        employee3.printEmployeeDetails();

        Employee employee4 = new Employee(104, "Divine", 260000.23);
        employee4.printEmployeeDetails();
    }
}
