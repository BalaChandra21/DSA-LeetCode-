import java.util.*;

class Solution {
    public int minOperations(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int operations = 0;

        for (int count : map.values()) {
            if (count == 1) {
                return -1;
            }
            operations += count / 3;
            if (count % 3 == 1) {
                operations++;
            }
            else if (count % 3 == 2) {
                operations++;
            }
        }

        return operations;
    }
}