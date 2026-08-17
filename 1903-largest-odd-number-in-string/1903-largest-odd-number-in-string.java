class Solution {
    public String largestOddNumber(String num) {
        // StringBuilder s = new StringBuilder(num);
        // while(s.length()>0)
        // {
        //     int last = s.charAt(s.length() -1) -'0';
        //     if(last % 2 != 0) return s.toString();
        //     s.deleteCharAt(s.length()-1);
        // }
        // return "";
        for(int i=num.length()-1;i>=0;i--)
        {
            int n = num.charAt(i) -'0';
            if(n % 2 != 0) return num.substring(0,i+1);
        }
        return  "";
        
    }
}