class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        StringBuilder sb =new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
              stk.pop();
            }
            else
            {
                stk.push(s.charAt(i));
            }
        }
        while(!stk.empty())
        {
            sb.append(stk.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}