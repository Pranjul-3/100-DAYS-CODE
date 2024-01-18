class Solution {
    public int[] sortedSquares(int[] nums) {
        int x []= new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            x[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(x);
        return x;
    }
}