class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String str1 = "";
        for (int i = str.length - 1; i > 0; i--) {
            str1 = str1+ str[i] + " ";
        }
        return str1 + str[0];
    }
}
        