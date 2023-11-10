class Solution {
    public int getSum(int a, int b) 
    {
        if(b>0)
        {
            for(int i=1;i<=b;i++)
            {
                a++;
            }
        }
        else if (b<0)
        {
            for(int i=0;i>b;i--)
            {
                a--;
            }
            
        }
        return a;
        
        
    }
}
 // or use the function Integer.sum(a,b)