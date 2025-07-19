package jul19;

public class Employee {

    int id;
    String name;
    double salary;
    static String companyName = "Pragra";

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("CompanyName : "+companyName);

        // control + D  - to duplicate a line
    }

}
