package aug19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

       /* Integer result = list.get(3);
        System.out.println(result);*/

        list.remove(0);

        Integer result = list.set(3, 1000);
        System.out.println(result);

        System.out.println(list.contains(1000));

        Object[] objects = list.toArray();

        System.out.println(list);


        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
    }
}
