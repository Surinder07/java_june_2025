package jul26;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Honda";
        car.speed = 200.21;
        car.color = "white";

        System.out.println("printing Car details...");
        car.printVehicleDetails();

        Honda honda = new Honda();
        honda.brand = "Honda";
        honda.color ="Black";
        honda.speed = 122.12;
        System.out.println();
        System.out.println("Printing HONDA");
        honda.printVehicleDetails();
    }
}
