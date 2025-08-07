class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1)
        {
        if(nums[0] == target) 
        {
            return 0;
        }
        else
        {
            return -1;
        }
        }

        int start=0;
        int end = nums.length-1;
        int mid = -1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid]<=target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid = -1;
        }
        return  mid; 
    }
}