class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(i == map.get(i)) res = i;
        }
        return res;

    }
}