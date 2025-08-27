package aug23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet);

        List<Integer> list = Arrays.asList(10, 30, 450, 43,43, 435, 45, 4, 2, 3543, 34, 34, 34);
        // remove duplicates

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
        System.out.println(hashSet);
    }
}


/*
In the given list




 */