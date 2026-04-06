class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false; // can't reach this index
            }

            reachable = Math.max(reachable, i + nums[i]);

            if (reachable >= nums.length - 1) {
                return true; // already can reach end
            }
        }

        return true;
    }
}