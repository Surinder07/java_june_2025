package aug5;

public class Car extends Vehicle{

    @Override
    public void run() {
        System.out.println("Car is running...");
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
