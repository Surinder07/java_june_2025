package jul15;

public class Car {
    // member variables
        String brand;
        String color;
        int year;
        String model;

    // behaviour  - method - function

    // set of block of statements which perform a specific task, when we call them

    public void display(){
        System.out.println("Brand :" + brand);
        System.out.println("Color :" + color);
        System.out.println("Year :" + year);
        System.out.println("Model :" + model);
    }
                         // parameter
    public String greeting(String name){
        return "Hello " + name;
    }
}
