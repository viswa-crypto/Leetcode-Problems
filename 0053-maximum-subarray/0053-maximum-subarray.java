class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = 0;
        // if(nums.length == 1) return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            
            curr = Math.max(nums[i],curr+nums[i]);
            max= Math.max(max,curr);
        }
        return max;
        
    }
}