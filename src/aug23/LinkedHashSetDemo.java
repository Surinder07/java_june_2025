package aug23;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(40);
        linkedHashSet.add(70);
        linkedHashSet.add(20);
        linkedHashSet.add(20);
        linkedHashSet.add(null);


        System.out.println(linkedHashSet);
    }
}
