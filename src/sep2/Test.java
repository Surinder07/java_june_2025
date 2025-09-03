package sep2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        List<Integer> roll = new ArrayList<>();
        roll.add(154);
        roll.add(10);
        roll.add(103);
        roll.add(123);

        List<Integer> list = Arrays.asList(10, 23, 43, 34, 53, 34, 34);
      //  list.add(10); // wont be able to add with this, since it created immutable list

        System.out.println(list);

  // 10 20 30 40 50 60 70


        int[] arr = {12,32,53,34,3};
        Arrays.sort(arr);

        for (Integer e : arr) {
            System.out.println(e);
        }

        System.out.println("Index of the found item "+Arrays.binarySearch(arr, 212323));


    }
}
