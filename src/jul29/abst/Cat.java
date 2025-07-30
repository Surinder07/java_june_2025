package jul29.abst;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping..");
    }
}
