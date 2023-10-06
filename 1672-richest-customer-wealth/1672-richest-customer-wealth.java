class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int a[] : accounts) {
            
            int sum = 0;
            for (int b : a) {
                sum = sum+b;
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }
} 