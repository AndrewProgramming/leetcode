package question146;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(map);
    }
}
