class Solution {
    public int strStr(String haystack, String needle) {
        boolean is = haystack.contains(needle);
        int ind = -1;
        if(is) 
        {
           ind =  haystack.indexOf(needle);
        }
        return ind;
    }
}