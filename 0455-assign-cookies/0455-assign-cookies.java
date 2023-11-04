class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,i=0,j=0;
        while(i<g.length && j<s.length)
        {
            if(s[j] >= g[i])
            {
               c++;
               i++;
            }
            j++;
        }
     return i;   
    }
}

/** class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    c++;
                    s[j] = -1;
                    break;
                }
            }
        }
        return c;
    }
} **/