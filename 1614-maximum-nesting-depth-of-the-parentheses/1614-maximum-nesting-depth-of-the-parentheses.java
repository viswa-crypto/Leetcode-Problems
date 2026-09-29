class Solution {
    public int maxDepth(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        // int i=0;
        int max = 0;
        int curr = 0;
        for(int i=0;i<s.length();i++)
        {
            char x = arr[i];
            if(x == '(') 
            {
                stk.push(x);
                curr++;
                max = Math.max(max,curr);
            }
            else if(x == ')')
            {
                curr--;   
            }
            else
            {
                continue;
            }
        }
        return max;
    }
}