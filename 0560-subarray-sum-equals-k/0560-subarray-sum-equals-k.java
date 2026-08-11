class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> set = new HashMap<>();
        set.put(0,1);
        int max = 0;
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(set.containsKey(sum-k))
            {
                max+=set.get(sum-k);
            }
            set.put(sum , set.getOrDefault(sum ,0)+1);
        }
return max;
    }
}