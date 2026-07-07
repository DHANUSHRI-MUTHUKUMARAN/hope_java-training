import java.util.*;

public class Solution {

    static int dispsum(int[] arr, int st, int ed, int index, int sum) {

        // Base case
        if (st > ed)
            return sum;

        if (index % 2 == 0) {
            System.out.print(arr[ed] + " ");
            return dispsum(arr, st, ed - 1, index + 1, sum);
        } else {
            System.out.print(arr[st] + " ");
            sum += arr[st];          // Add only odd-position elements
            return dispsum(arr, st + 1, ed, index + 1, sum);
        }
    }

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = ip.nextInt();

        Arrays.sort(arr);

        int sum = dispsum(arr, 0, n - 1, 0, 0);

        System.out.println();
        System.out.println(sum);
    }
}