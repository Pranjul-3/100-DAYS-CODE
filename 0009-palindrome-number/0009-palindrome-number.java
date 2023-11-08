class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int temp=x,rev=0,r;
        while(temp!=0)
        {
          r=temp%10;
          rev=rev*10+r;
          temp=temp/10;
        }
        if(x==rev)
        {
          return true;
        }
        return false;

        
    }
}