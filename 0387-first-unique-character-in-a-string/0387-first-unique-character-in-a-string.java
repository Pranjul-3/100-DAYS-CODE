class Solution {
    public int firstUniqChar(String s) {
       int[] charFreq = new int[26]; 
        
        
        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            if (charFreq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
    