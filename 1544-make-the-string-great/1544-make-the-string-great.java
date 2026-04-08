class Solution {
    public String makeGood(String s) {
        if(s.length()<2) return s;
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray())
        {
            // char y = list.get(list.size());
            if(!stack.isEmpty() && Math.abs(x - stack.peek()) == 32)
            {
                stack.pop();
            }
            else
            {
                stack.push(x);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty())res.insert(0,stack.pop());
        return res.toString();
    }
}