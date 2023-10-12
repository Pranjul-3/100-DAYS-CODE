class Solution {
    public boolean isHappy(int n) {
       
        while(n!=1 && n!=4)
        { int sum=0;
             while(n>0)
        {
         int r=n%10;
            sum=sum+(r*r);
            n=n/10;
        }
            n=sum;
        }
        if(n==1)
            return true;
        else 
            return false;
        
        
    }
}