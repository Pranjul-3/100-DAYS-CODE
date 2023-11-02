import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        int j = 0;
        int l = g.length;
        int l1 = s.length;

        for (int i = 0; i < l && j < l1; i++) {
            while (j < l1 && s[j] < g[i]) {
                j++;
            }
            if (j < l1) {
                c++;
                j++;
            }
        }

        return c;
    }
}
