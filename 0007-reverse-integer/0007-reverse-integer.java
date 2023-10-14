class Solution {
    public int reverse(int x) {
        int rem;
        int rev=0;
        
        while(x!=0)
        {
            rem=x%10;
         if((rev<(-2147483648/10))||(rev>2147483647/10))
        {
            return 0;
        }
            rev=rev*10+rem;
            x=x/10;
    
        }
            return rev;
        
        
    }
}