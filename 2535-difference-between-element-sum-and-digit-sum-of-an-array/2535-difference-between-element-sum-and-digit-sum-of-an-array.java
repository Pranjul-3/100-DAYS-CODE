class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int a: nums)
        {
            s1=s1+a;
                while(a!=0)
                {
                int r=a%10;
                s2=s2+r;
                a=a/10;
            }
        
    }
        return s1-s2;
}
}