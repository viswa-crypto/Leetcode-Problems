class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = ((n)*(n+1))/2;
        // System.out.print(sum);
        for(int i=0;i<n;i++)
        {
            sum-=nums[i];
        }
        return sum;
        
    }
}