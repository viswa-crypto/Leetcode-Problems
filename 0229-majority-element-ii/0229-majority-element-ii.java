class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int x = nums[i];
            h.put(x,h.getOrDefault( x , 0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer , Integer> ent : h.entrySet())
        {
            if(ent.getValue() > n/3)
            {
                l.add(ent.getKey());
            }
        }
        return l;
    }
}