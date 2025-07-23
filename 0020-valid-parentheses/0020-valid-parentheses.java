import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stk.push(x);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }

                char check=stk.peek();
                if ((x == ')' && check == '(') ||
                    (x == '}' && check == '{') ||
                    (x == ']' && check == '[')) {
                    stk.pop();
                }
                else
                {
                    stk.push(x);
                }
            }
        }

        return stk.isEmpty();
    }
}
