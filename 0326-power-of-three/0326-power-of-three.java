class Solution {
    public boolean isPowerOfThree(int n) {
        int a=0;
        if(n==0)
        {
            return false;
        }
        while(true)
        {
            if(Math.pow(3,a)==n)
            {
                return true;
            }
            else if(Math.pow(3,a)<n)
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