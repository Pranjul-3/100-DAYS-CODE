class Solution {
    public int rob(int[] nums) {
        int e= 0;
        int o = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0)
            {
                e=Math.max(e+nums[i],o); // sum of even postion
            }
            else
            {
                o=Math.max(o+nums[i], e);
            }
        }
        return Math.max(e,o);
    }
}

/** class Solution {
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
}**/