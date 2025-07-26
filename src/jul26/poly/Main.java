package jul26.poly;

public class Main {
    public static void main(String[] args) {

       /* Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 20, 23));*/


        // parent class ref ---- to the child class object
        // Upcasting..
        SuperAnimal animal = new BiggerCat();
        animal.eat();


    }
}
