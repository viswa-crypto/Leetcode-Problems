class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int j=0,k=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0) pos[j++] = nums[i];
        else neg[k++] = nums[i];
       }
       int i=0;
       j=0;
       k=0;
       while(j<pos.length && k<neg.length)
       {
        arr[i++] = pos[j++];
        arr[i++] = neg[k++];
       }
       return arr;
    }
}