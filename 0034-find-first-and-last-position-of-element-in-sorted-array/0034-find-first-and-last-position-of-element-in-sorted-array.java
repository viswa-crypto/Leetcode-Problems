class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1} ;
        int[] res = {-1,-1};
        res[0] = binarySearch(nums , target , true);
        res[1] = binarySearch(nums , target , false);
        return res;
    }
    public int binarySearch(int[] nums , int tar , boolean isleft)
    {
        int left = 0;
        int right = nums.length-1;
        int ind = -1;
        while(left<=right)
        {
            int mid = left + (right -left) / 2;
            if(nums[mid]>tar)
            {
                right = mid-1;
            }
            else if(nums[mid]<tar)
            {
                left =mid+1;
            }
            else
            {
                ind = mid;
                if(isleft)
                {
                    right = mid-1;
                }
                else
                 {
                    left = mid+1;
                 }
            }
        } 
        return ind;
    }

}