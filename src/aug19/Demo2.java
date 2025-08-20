package aug19;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> iterator2 = list.listIterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println();
        while (iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        }

        System.out.println();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}

//    1 2 3 4 5
//  given a list  10 15 25  30 35 45 50

// calculate the sum of this list
// remove all odd numbers from the list
// find the max/min element from the list
