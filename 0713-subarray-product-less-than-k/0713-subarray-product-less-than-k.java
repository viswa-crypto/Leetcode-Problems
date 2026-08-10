class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n = nums.length;
        int res=0;
        int sum = 1;
        int left =0;
        for(int i=0;i<n;i++)
        {
            sum *=nums[i];
            while(sum>=k)
            {
                sum/=nums[left];
                left++;
            }
            res+=i-left+1;
        }
        return res;
    }
}