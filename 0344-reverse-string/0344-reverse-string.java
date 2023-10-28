class Solution {
    public void reverseString(char[] s) 
    {
         String s1="";
    String s2="";
    
        for(int i=0; i<=s.length-1; i++)
        {
            s1=s1+s[i];
        }
    for(int i=s1.length()-1; i>=0; i--)
    {
      s2=s2+s1.charAt(i);
    }
        for(int i=0; i<=s2.length()-1; i++)
        {
           s[i]=s2.charAt(i);
        }
    }
}