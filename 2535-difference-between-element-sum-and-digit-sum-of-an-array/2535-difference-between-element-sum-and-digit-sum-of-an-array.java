class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int a: nums)
        {
            s1=s1+a;
            if(a>9)
            {
                while(a!=0)
                {
                int r=a%10;
                s2=s2+r;
                a=a/10;
            }
        }
            else
            {
                s2=s2+a;
            }
        
    }
        return s1-s2;
}
}