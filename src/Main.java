import aug5.Animal;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.set();
    }

    public  void set(){
        Animal animal = new Animal() {
            @Override
            public void eat() {


            }

            @Override
            public void makeSound() {

            }
        };
        animal.makeSound();
        animal.eat();
    }
}