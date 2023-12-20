class Solution {
    public int averageValue(int[] nums) {
        int c = 0, s = 0;

        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                c++;
                s += n;
            }
        }

        // Check if there are elements that satisfy the condition
        if (c != 0) {
            return s / c;
        } else {
            // Handle the case when there are no elements that satisfy the condition
            return 0; // You can choose to return 0 or another value based on your requirements
        }
    }
}
