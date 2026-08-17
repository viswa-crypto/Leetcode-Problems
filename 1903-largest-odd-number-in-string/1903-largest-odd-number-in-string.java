class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s = new StringBuilder(num);
        while(s.length()>0)
        {
            int last = s.charAt(s.length() -1) -'0';
            if(last % 2 != 0) return s.toString();
            s.deleteCharAt(s.length()-1);
        }
        return "";

        
    }
}