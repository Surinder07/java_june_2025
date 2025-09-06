package sep6;


class OuterDemo{
    public void show(){

        // this class within the method
        class LocalInnerClass{
            public void insideLocalInnerClass(){
                System.out.println("Inside Local Inner class ...");
            }
        }
        // Object should be created within the method
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.insideLocalInnerClass();
    }
}

public class LocalDemo {
    public static void main(String[] args) {
        OuterDemo outerDemo = new OuterDemo();
        outerDemo.show();




    }
}
