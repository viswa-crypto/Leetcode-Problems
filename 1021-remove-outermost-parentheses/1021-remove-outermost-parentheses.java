class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String res = "";
        for(char x : s.toCharArray())
        {
           if(x == '(')
           {
            if(c!=0) res+=x;
            c++;
           }
           else
           {
            c--;
            if(c!=0) res+=x;
           }
        }
        return res;
    }
}