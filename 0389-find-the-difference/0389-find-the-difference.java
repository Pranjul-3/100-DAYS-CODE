class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch = s.toCharArray();
        char[] c = t.toCharArray();
        char result = 0;

        for (int i = 0; i < ch.length; i++) {
            result ^= ch[i];
        }

        for (int i = 0; i < c.length; i++) {
            result ^= c[i];
        }

        return result;
    }
}