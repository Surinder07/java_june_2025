package aug23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(40);
        set.add(null);
        set.add(null);
        System.out.println(set);
        System.out.println(set.contains(30));
        System.out.println(set.remove(30));
        System.out.println(set);


        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
