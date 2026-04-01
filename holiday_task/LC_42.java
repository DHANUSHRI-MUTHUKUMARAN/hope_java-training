class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Build leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = leftMax[i - 1] > height[i] ? leftMax[i - 1] : height[i];
        }

        // Build rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = rightMax[i + 1] > height[i] ? rightMax[i + 1] : height[i];
        }

        // Calculate total trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = leftMax[i] < rightMax[i] ? leftMax[i] : rightMax[i];
            totalWater += minHeight - height[i];
        }

        return totalWater;
    }
}