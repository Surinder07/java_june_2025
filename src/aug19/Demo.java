package aug19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
/*

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
*/

     /*   for (Integer e: list) {
            System.out.println(e);
        }
*/

        // Iterator

        Iterator<Integer> iterator = list.iterator();

       /* while (iterator.hasNext()){
            Integer n = iterator.next();
            if(n % 2 == 0){
                list.remove(n);
            }

        }*/

        while (iterator.hasNext()){
            Integer n = iterator.next();
            if(n % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
