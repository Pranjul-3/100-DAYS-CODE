class Solution {
    public boolean isSubsequence(String s, String t) {
        
   char []ch=s.toCharArray();
       char[]tt=t.toCharArray();
       int n=s.length();
       int m=t.length();
       int i=0;
       int j=0;
       if(n<1)
           return true;
       while(i<m)
       {
           if(tt[i]==ch[j])
           {
               j++;
           }
           i++;
           if(j==n) 
               return true;
       }
       return false;
    }
}