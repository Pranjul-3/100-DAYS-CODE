class Solution {
    public boolean isPowerOfTwo(int n) {
       int p=0;
        while(true)
        {
           if(Math.pow(2,p)==n) 
           {
             return true;
           }
         else if  (Math.pow(2,p)<n)
           {
               p++;
           }
            else
            {
return false;
}
        }
        
        
    }
}