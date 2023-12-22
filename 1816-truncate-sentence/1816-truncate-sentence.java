class Solution {
    public String truncateSentence(String s, int k) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
            if (c == k) {
            
                return s.substring(0, i);
            }
        }
        
        return s;
    }
}
