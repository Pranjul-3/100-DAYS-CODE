class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
     
        int n = triangle.size();

        int[][] dp = new int[n][triangle.get(n-1).size()];

        Arrays.stream(dp).forEach(a -> Arrays.fill(a, Integer.MAX_VALUE));

        return rec(triangle, 0, 0, dp);
    }

    public int rec(List<List<Integer>> arr, int i, int row, int[][] dp){
        if(row >= arr.size() || i >= arr.get(row).size()){
            return 0;
        }

        if(dp[row][i] != Integer.MAX_VALUE){
            return dp[row][i];
        }

        // as it clearly is understood, we can make two choices at every step of the way..

        // and parameters such as row and ith element can help us define a particular state we are in..
        // hence i used row and i as parameters..

        int choice_1 = rec(arr, i, row+1, dp);
        int choice_2 = rec(arr, i+1, row+1, dp);

        // and keeping a faith the method "rec" return me the min path possible..

        // just add this ith num to the min possible you get from both the choices..

        // rest is memoization using 2D array..

        return dp[row][i] = arr.get(row).get(i)+Math.min(choice_1, choice_2);
    }
}