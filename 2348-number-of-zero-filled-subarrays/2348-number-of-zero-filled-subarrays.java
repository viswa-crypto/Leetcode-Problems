class Solution {
    public long zeroFilledSubarray(int[] nums) {
      long count =0, streak= 0;
      for(int i  : nums){
        streak = (i==0) ?streak+1:0;
        count += streak;
      }
      return count;
    }
}