/*public class Closest {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 40};
        int target = 23;

        int res = closest(arr, target);
        System.out.println("Closest element: " + res);
    }

    public static int closest(int[] arr, int target) {
        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - target) < Math.abs(closest - target)) {
                closest = arr[i];
            }
        }
        return closest;
    }
} */
import java.util.*;

public class Closest {
    public static void main(String[] args) {

        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> hashSet = new HashSet<>();

        int[] arr = {5, 3, 9, 1, 7, 2};

        for (int i : arr) {
            linkedSet.add(i);
            hashSet.add(i);
        }

        System.out.println("LinkedHashSet: " + linkedSet);
        System.out.println("HashSet: " + hashSet);
    }
}