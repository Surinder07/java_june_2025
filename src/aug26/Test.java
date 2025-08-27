package aug26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(32, .50f);
        map.put(101, "Divine");  // entry
        map.put(103, "Divine");
        map.put(104, "Divaynshu");
        map.put(105, "Palak");
        map.put(null, "Zakir");
        map.put(102, "Vrunda");
        System.out.println(map);

        Set<Integer> keyset = map.keySet();
        System.out.println("Set of keys " + keyset);
        System.out.println("Values : "+map.values());
        System.out.println("Entry set : "+map.entrySet());
        System.out.println("Contains key 110 : "+map.containsKey(110));
        System.out.println("Value for 102 : "+map.get(102));
        System.out.println("Get or default :  "+map.getOrDefault(110, "10000"));
        System.out.println("Map put if absent "+map.putIfAbsent(101, "Test"));
        System.out.println(map);



    }
}
