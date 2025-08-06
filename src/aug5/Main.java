package aug5;

public class Main {
    public static void main(String[] args) {
        // Upcasting, polymorphism
        // parent class ref can be assigned to child class object
        Animal animal = new Cat();
        animal.eat();
        animal.makeSound();

       /* Cat cat = new Cat();
        cat.eat();
        cat.makeSound()*/
    }

}
