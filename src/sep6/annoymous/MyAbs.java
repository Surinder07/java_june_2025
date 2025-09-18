package sep6.annoymous;

public abstract class MyAbs {
    abstract void test();
}

class Main2 {
    public static void main(String[] args) {
        MyAbs myAbs = new MyAbs() {
            @Override
            void test() {

            }
        };
        myAbs.test();
    }
}