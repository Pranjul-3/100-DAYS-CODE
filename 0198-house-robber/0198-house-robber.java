class Solution {
    public int rob(int[] nums) {
        int i= 0;
        int j = 0;

        for (int n : nums) {
            int k = i+n;
            i = Math.max(i,j);
             j=k;
        }

        return Math.max(i,j);
    }
}