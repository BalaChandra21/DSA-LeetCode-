class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original = n;

        while (n > 0) {
            int temp = n % 10;

            sum += temp;
            product *= temp;

            n /= 10;
        }

        int t = sum + product;

        return original % t == 0;
    }
}