class Solution {
    public int maxArea(int[] arr) {
        int f = 0;
        int l = arr.length-1;
        int max = 0;
       while(f<=l)
       {
        int area = Math.min(arr[f],arr[l])*(l-f);
        max = Math.max(max,area);
        if(arr[f]>arr[l]) l--;
        else f++;
       }
       return max;
    }
}