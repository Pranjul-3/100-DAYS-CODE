class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int t=x;

        while(x != 0)   
{  
int remainder = x % 10;  
reverse = reverse * 10 + remainder;  
x = x/10;  


        
    }
    if(t>=0)
    {
    if (reverse == t)
    return true;
    else 
    return false;
    }
    else
    {
      return false;  
    }
}
}