class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=-1, b=-1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        { 
        if(nums[i]==target)
        {
          if(a==-1)
          {
            a=i;
              
          } 
            b=i;
        
        
    }
}
        return new int[]{a, b};
}
}