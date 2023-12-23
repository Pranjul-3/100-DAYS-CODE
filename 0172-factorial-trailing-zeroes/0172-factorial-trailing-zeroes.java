class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        // Count the number of factors of 5 in the range [1, n]
        for (int i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
