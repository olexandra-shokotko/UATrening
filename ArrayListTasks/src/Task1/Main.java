package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        integers.add(4);
        integers.add(5);
        integers.add(-6);
        integers.add(4);
        integers.add(5);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        integers.add(7);

        Integer t = new Integer(1);

        for (int i = 0; i < integers.size(); i++) {
            if (!map.containsKey(integers.get(i))) {
                map.put(integers.get(i), 0);
            }
            t = map.get(integers.get(i));
            map.put(integers.get(i), t+1);
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            System.out.printf("Key: %d  Value: %d \n", item.getKey(), item.getValue());
        }
    }
}
