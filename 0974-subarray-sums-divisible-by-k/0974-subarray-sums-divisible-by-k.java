class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int sum =0;
        int arr[] = new int[k];
        arr[0] = 1;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int rem = ((sum%k)+k)%k;
            res+=arr[rem];
            arr[rem]++;
        }
        return res;
    }
}