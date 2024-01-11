class Solution {
    public String reversePrefix(String word, char ch) {
        
        int ind = word.indexOf(ch);
        String s = word.substring(0, ind + 1);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString() + word.substring(ind + 1, word.length());
        return s;
    }
}

/**class Solution {
    public String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                String prefix = word.substring(0, i + 1);
                String reversedPrefix = new StringBuilder(prefix).reverse().toString();
                return reversedPrefix + word.substring(i + 1);
            }
        }
        return word; 
    }
}**/


/**class Solution {
    public String reversePrefix(String word, char ch) {
        String str1="";
        for(int i=0;i<word.length(); i++)
        {
            if(word.charAt(i)==ch)
            {
              String  str=word.substring(0,i+1);
                for(int j=str.length()-1; j>=0; j--)
                {
                    str1=str1+str.charAt(j);
                }
                return str1+word.substring(i+1,word.length());
            }
        }
        return word;
    }
}**/