package aug5;

public abstract class Vehicle {

    // abstract methods does not have body
    public abstract void run();
    public abstract void start();
    public  void stop(){
        System.out.println("Vehicle class method.");
    }
}

