package aug26;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(32, .50f);
        map.put(101, "Divine");  // entry
        map.put(103, "Divine");
        map.put(104, "Divaynshu");
        map.put(105, "Palak");
        map.put(null, "Zakir");
        map.put(102, "Vrunda");

      //  Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String > entry : map.entrySet()) {
          //  System.out.println(entry.getValue());
            //System.out.println(entry.getKey());
        }

        // loop over keys
        for (Integer key: map.keySet()) {
            System.out.println(key);
        }

        // loop over values
        for (String value: map.values()) {
            System.out.println(value);
        }

        //  create a HashMap, with students name and marks,
        // print all the students with their marks
        // print the student name  with highest marks and also the marks.

    }
}
