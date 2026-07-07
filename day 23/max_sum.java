import java.util.Scanner;

public class max_sum {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}