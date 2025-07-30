package jul29.abst;

public abstract class Animal {

    // abstract and non abstract methods
    // abstract methods are those, which does not have body
    // abstract classes cannot be instantiated/
    // objects cannot be created...

    // abstract methods
    public abstract void eat();
    public abstract void run();
    public abstract void sleep();

    // non abstract methods
    public void reading(){
        System.out.println("animal is flying..");
    }
}
