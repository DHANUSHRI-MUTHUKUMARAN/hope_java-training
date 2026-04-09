import java.util.*;

public class Freq {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};

        for (int i : arr) {
            /*if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }*/
            map.put(i,map.getOrDefault(i, 0) + 1); // this line can replace the above if-else block
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}