class Solution {
    public String largestOddNumber(String num) {
        int x=0;
        int n=num.length()-1;
        for(int i=n;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2 != 0)
            {
                 return num.substring(0,i+1);
            }
        }
        return "";       
    }
}