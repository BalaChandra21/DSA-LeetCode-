class Solution {
    public boolean uniformArray(int[] nums) {

        int smallestOdd = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x % 2 != 0) {
                smallestOdd = Math.min(smallestOdd, x);
            }
        }

        if (smallestOdd == Integer.MAX_VALUE) {
            return true;
        }
        for (int x : nums) {
            if (x % 2 == 0 && smallestOdd >= x) {
                return false;
            }
        }

        return true;
    }
}