
import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        long[] diff = new long[n];

        long total = 0;
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
        }

        if (total <= k) return 0;

        long low = 0, high = 100000;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long ops = 0;

            for (long d : diff) {
                if (d > mid) ops += d - mid;
            }

            if (ops <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long ans = 0;
        long used = 0;

        for (long d : diff) {
            if (d > low) {
                used += d - low;
                d = low;
            }
            ans += d * d;
        }

        long remaining = k - used;
        ans -= remaining * (2 * low - 1);

        return ans;
    }
}
