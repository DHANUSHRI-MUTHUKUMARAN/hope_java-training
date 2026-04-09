import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i, arr[i]);
        }
        System.out.println(map.keySet()); // acess nly the keys
        System.out.println(map.values()); // acess nly the values
        System.out.println(map.entrySet()); // acess both keys and values

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){ // acess both keys and values using entrySet
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}