class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder l = new StringBuilder();
        StringBuilder r = new StringBuilder();

        for (String str : word1) {
            l.append(str);
        }

        for (String str : word2) {
            r.append(str);
        }

        return l.toString().equals(r.toString());
    }
}
