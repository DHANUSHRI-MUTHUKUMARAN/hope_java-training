class LC_53 {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=curr+nums[i];
            if(nums[i]>curr) curr=nums[i];
            if(curr>max) max=curr;
        }
        return max;
    }
}