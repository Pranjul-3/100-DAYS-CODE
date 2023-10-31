class Solution {
    public boolean isPowerOfFour(int n) {
        int a=0;
        while(true)
        {
            if(Math.pow(4,a)==n)
            {
                return true;
            }
            else if(Math.pow(4,a)<n)
            {
                a++;
            }
            else
            {
                return false;
            }
        }
        
    }
}