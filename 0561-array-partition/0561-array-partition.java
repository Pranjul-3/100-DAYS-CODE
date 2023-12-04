class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i,sum=0;
        for(i=0; i<nums.length; i=i+2)
        {
            sum=sum+nums[i];
        }
        return sum;
    }
}