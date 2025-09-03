package sep2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList( 2, 34, 5, 6, 6, 7, 4);

        List<List<Integer>> lists = Collections.singletonList(list1);
        System.out.println(lists);


        System.out.println(Collections.min(list1));


        //
       /* List<Integer> roll = new ArrayList<>();
        roll.add(154);
        roll.add(10);
        roll.add(103);
        roll.add(123);


        List<Integer> list = Collections.unmodifiableList(roll);
        list.add(10);



        // singleton class
        // can a constuctor be private ?


*/

    }
}
