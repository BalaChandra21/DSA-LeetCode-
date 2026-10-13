import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        // Step 1: Square every element and store them back (using long to prevent overflow)
        long[] squares = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        
        // Step 2: Sort the squared array in ascending order
        Arrays.sort(squares);
        
        long ans = 0;
        int n = squares.length;
        int m = n / 2;
        
        // Step 3: Subtract the smallest squares (odd position slots)
        for (int i = 0; i < m; i++) {
            ans -= squares[i];
        }
        
        // Step 4: Add the remaining larger squares (even position slots)
        for (int i = m; i < n; i++) {
            ans += squares[i];
        }
        
        return ans;
    }
}