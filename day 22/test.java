import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 7, 4, 4, 5};
        int lower = 3, upper = 6;

        System.out.println(countFairPairs(nums, lower, upper));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = lowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
            int right = upperBound(nums, i + 1, nums.length - 1, upper - nums[i]);

            count += (right - left);
        }

        return count;
    }

    // First index where value >= target
    private static int lowerBound(int[] nums, int start, int end, int target) {
        int left = start, right = end + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // First index where value > target
    private static int upperBound(int[] nums, int start, int end, int target) {
        int left = start, right = end + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}