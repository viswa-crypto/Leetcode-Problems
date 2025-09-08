class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
       HashMap<Integer,Integer> mp = new HashMap<>();
       for( int x : nums){
        mp.put(x,mp.getOrDefault(x,0)+1);
       }
       for(Map.Entry<Integer,Integer> ex : mp.entrySet())
       {
        if(ex.getValue()>n) return(ex.getKey());
       }
       return -1;
    }
}