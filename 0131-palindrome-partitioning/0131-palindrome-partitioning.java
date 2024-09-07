class Solution {
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    
    public void partitionHelper(int start, String s, List<List<String>> list, List<String> current) {
        if (start == s.length()) {
            list.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));
                partitionHelper(end + 1, s, list, current);
                current.remove(current.size() - 1);
            }
        }
    }
     public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        partitionHelper(0, s, list, new ArrayList<>());
        return list;
    } 
}