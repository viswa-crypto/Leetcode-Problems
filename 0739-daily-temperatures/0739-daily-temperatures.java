import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        
        // The stack will store the *indices* of the temperatures, not the temperatures themselves.
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // While stack is not empty AND the current day's temperature is warmer 
            // than the temperature of the day at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                // The number of days waited is the difference between indices
                result[prevIndex] = i - prevIndex; 
            }
            // Push the current day's index onto the stack to find its next warmer day later
            stack.push(i);
        }
        
        return result;
    }
}