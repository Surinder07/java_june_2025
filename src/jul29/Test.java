package jul29;

public class Test {
    public static void main(String[] args) {
       A a1 = new C();
       A a2 = new B();
       B a3 = new C();
    }
}


class A {

}
class B extends A {

}
class C extends B {

}
