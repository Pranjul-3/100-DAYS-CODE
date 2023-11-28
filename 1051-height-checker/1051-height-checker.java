class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int a []=new int [heights.length];
            for(int i=0;i<heights.length; i++)
            {
                a[i]=heights[i];
            }
        Arrays.sort(a);
        for(int i=0;i<heights.length; i++)
            {
                if(a[i]!=heights[i])
                {
                    c++;
                }
                }
        return c;
            }
    }
