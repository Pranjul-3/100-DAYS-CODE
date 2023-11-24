class Solution {
    public String reverseVowels(String s) {
        String str1="",str2="";
        for(int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    str1=ch+str1;
                }
            }
            }
        int j=0;
        for(int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    str2=str2+str1.charAt(j);
                    j++;
                }
                else
                {
                    str2=str2+ch;
                }
            }
            }
        return str2;
        
        }
        
    }
