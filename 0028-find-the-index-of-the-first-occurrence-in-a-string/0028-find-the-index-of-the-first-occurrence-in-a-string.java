class Solution {
    public int strStr(String haystack, String needle) {
        int l=haystack.length();
        int l1=needle.length();
        for(int i=0; i<l-l1+1; i++)
        {
          if(haystack.substring(i,i+l1).equals(needle))
          {
              return i;
          }
        }
        return -1;
    }
}