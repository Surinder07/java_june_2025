package sep6;


class OuterClass {
    class InnerClass {

        public void show(){
            System.out.println("inside the show method...");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        // create object of outer class
        OuterClass outerClass = new OuterClass();

        // create inner class object with .new syntax
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }
}
