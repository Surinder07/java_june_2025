package aug16;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        list.remove(0);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(2));



    }
}
