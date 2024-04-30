class Solution {
    public int minPathSum(int[][] grid) {
               int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;
                 int right = Integer.MAX_VALUE;
                 if(j-1 >= 0) right = dp[i][j-1] + grid[i][j];
                 int down = Integer.MAX_VALUE;
                 if(i-1 >= 0) down = dp[i-1][j] + grid[i][j];
                 dp[i][j] = Math.min(right, down);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}