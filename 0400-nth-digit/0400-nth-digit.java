class Solution {
    public int findNthDigit(int n) {
        if(n<10) return n;
        long cnt =9 , start = 1;
        int dl =1;
        while(n > dl * cnt){
            n -= dl*cnt;
            dl++;
            start *= 10;
            cnt *= 10;
        }
        long res = start + (n-1)/dl;
        String num = Long.toString(res);
        return  num.charAt((n-1)%dl)-'0';
     }
}