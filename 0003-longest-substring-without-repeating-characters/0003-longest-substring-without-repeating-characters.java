class Solution {
    public int lengthOfLongestSubstring(String s) {
        String st = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = st.indexOf(ch);
            if (index != -1) {
                st = st.substring(index + 1);
            }
            st=st+ch;
            maxLength = Math.max(maxLength, st.length());
        }
        return maxLength;
    }
}