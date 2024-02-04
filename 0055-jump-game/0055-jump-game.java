class Solution {
    public boolean canJump(int[] nums) {
        
     int target = nums.length - 1;
        
        if (nums.length == 1)
            return true;

        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] >= (target - i)) {
                target = i;
            }
            i--;
        }

        return target == 0;
    }
}