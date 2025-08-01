class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int no = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
               int temp = nums[i];
               nums[i] = nums[no];
               nums[no] = temp;
               no++;
            }
        }
        
        
    }
}