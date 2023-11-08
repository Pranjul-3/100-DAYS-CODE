class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

         String s=x+"";
         int len=s.length();
         int f=0;
         int l=len-1;
         while(f<l)
         {
           if(s.charAt(f)==s.charAt(l))
           {
             f++;
             l--;
           }
           else
           {
             return false;
           }
         }
         return true;
    }
}