import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // Use Long to prevent integer overflow
        TreeSet<Long> window = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];
            
            // Find the smallest number in the window that is >= (current - valueDiff)
            Long ceil = window.ceiling(current - valueDiff);
            
            // If such a number exists, and it's also <= (current + valueDiff), we found a match
            if (ceil != null && ceil <= current + valueDiff) {
                return true;
            }
            
            // Add the current number to the window
            window.add(current);
            
            // Slide the window: if the window size exceeds indexDiff, remove the oldest element
            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }
        
        return false;
    }
}