package sep6.java8;

@FunctionalInterface
interface Mobile{
    void call();
}

public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile() {
            @Override
            public void call() {

            }
        };


    }
}
