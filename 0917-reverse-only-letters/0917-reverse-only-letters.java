class Solution {
    public String reverseOnlyLetters(String s) {
        String str1="";
        String str2="";
        for(int i=0; i<s.length(); i++)
        {
          if(Character.isLetter(s.charAt(i)))
             {
                 str1=s.charAt(i)+str1;
             }
        }
          int j=0;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                str2=str2+str1.charAt(j);
                j++;
            }
            else
            {
                str2=str2+s.charAt(i);
            }
        }
        return str2;
    }
}