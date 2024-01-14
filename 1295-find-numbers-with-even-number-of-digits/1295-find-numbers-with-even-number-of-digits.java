class Solution {
    public int findNumbers(int[] nums) {
        int s=0;
        for(int i: nums)
        { int t=i,c=0;
           while(t!=0)
           {
              int r=t%10;
               t=t/10;
               c++;
           }
         if(c%2==0)
         {
             s++;
         }
        }
        return s;
    }
}