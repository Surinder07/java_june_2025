package jul19.bankdemo;

public class Counter {

    static int x = 10000;

    Counter(){
        int y  = 100;
        System.out.println(x);
        x = x -y;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

    }
}

// 15 mins break.