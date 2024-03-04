class Solution {
    public int longestPalindrome(String s) {
        
   int old = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) % 2 == 1) old++;
            else old--;
        }
        if(old > 1) return s.length() - old + 1;
        return s.length();
    }
}
