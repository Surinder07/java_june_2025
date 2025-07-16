package jul15;

public class CarMain {
    public static void main(String[] args) {

        // method needs to static
        // we need object to call a method

        int   x = 10;
        Car car = new Car();
        car.brand = "Audi";
        car.color = "Red";
        car.year = 2025;
        car.model = "A4";

        // this is how you call a method
        car.display();
                        // this is how you call a method
        String greeting = car.greeting("Jatin"); // argument

        System.out.println(greeting);


    }
}
