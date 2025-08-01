class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count  =0;
        int temp = count;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                count++;
                if(temp<count)
                 temp = count;
            }
            else
             count = 0;
        }
        return temp;

        
    }
}