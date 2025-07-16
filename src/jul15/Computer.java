package jul15;

public class Computer {
    int memory;
    String brand;

    // default
    Computer(){
        System.out.println("Default constructor ....");
    }

    // parameterized constructor
    Computer(int memory, String brand){
         this.memory = memory;
         this.brand = brand;
    }



}
