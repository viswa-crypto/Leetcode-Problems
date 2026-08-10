class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
       int n = nums.length;
        int res = 0;
        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k)) res+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res; 
    }
}