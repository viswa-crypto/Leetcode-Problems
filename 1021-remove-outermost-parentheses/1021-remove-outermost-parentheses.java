class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String res = "";
        for(char x : s.toCharArray())
        {
            if(x == '(' && c == 0)
            {
                c++;
            }else if(x == '(' && c >0)
            {
                res+=x;
                c++;
            }
            else if(x == ')' && c>1)
            {
                res+=x;
                c--;
            }else
            {
                c--;
            }
        }
        return res;
    }
}