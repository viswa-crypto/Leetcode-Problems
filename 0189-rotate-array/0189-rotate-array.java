class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] =  new int[n];
        int pos = k%n;
        int j = 0;
        for(int i=n-pos;i<n;i++)
        {
           arr[j] = nums[i];
           j++;
        }
        for(int i=0;i<n-pos;i++)
        {
           arr[j] = nums[i];
           j++;
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = arr[i];
        }
    }
}