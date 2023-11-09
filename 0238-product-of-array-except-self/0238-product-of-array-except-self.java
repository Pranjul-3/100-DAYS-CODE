class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int pro=1 , c=0;

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
            {
                c++;
            }
            else 
            {
                pro=pro*nums[i];
            }
        }
        
        if (c==0)
        {
            for (int i = 0; i < nums.length; i++)
                ans[i] = pro/nums[i];
        }
        else if (c==1) 
        {
            for (int i = 0; i < nums.length ; i++)
                if (nums[i] == 0)
                    ans[i] = pro;
        }

        return ans;
    }
}