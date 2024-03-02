class Solution {
    public int missingInteger(int[] nums) {
     int i=0,s=nums[0];
    HashSet<Integer>hm=new HashSet<>();
    
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
            s+=nums[i];
        
        else
        break;
        }
    for(i=0;i<nums.length;i++)
    {
        hm.add(nums[i]);
    }
    if(!hm.contains(s))
    return s;
    while(hm.contains(s))
    {
        s++;
    }
    return s;

        
    }
}
