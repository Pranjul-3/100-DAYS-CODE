class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0 , j = s.length()-1;

        while (i < j)
        {
            char c1 = arr[i];
            char c2 = arr[j];
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                arr[i++] = c2;
                arr[j--] = c1;
            }
            if(!Character.isLetter(c2)){
                j--;
            }
            if (!Character.isLetter(c1)){
                i++;
            }
        }

        return new String(arr);

    }
}

/**class Solution {
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
}**/