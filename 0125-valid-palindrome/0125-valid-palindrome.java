class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        String str1="";
        
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
          if(Character.isLetterOrDigit(a))
             {
                 str=str+a;
             }
        }
        str=str.toLowerCase();
        for(int i=str.length()-1; i>=0; i--)
        {
           str1=str1+str.charAt(i);
        }
        
        if(str.length()==0 || (str.equals(str1)))
        {
          return true;
        }
        
            return false;
        }
    }
