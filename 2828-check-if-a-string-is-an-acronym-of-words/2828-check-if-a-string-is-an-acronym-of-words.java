class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
   int i = 0;
        int n = s.length();
        if(n != words.size()) return false;
        for(String word : words) {
            if(word.charAt(0) != s.charAt(i++)) return false;
        }
        return true;
    }
}