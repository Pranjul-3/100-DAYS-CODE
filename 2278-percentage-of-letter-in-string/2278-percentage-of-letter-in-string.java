class Solution {
    public int percentageLetter(String s, char letter) {
        int l= s.length();
        int c=0;
        for(int i=0; i<l;i++)
        {
            if(s.charAt(i)==letter)
            {
                c++;
            }
        }
        if(c>0)
        {
            double x= ((double)c/l);
            return (int)(x*100);
        }
        return 0;
    }
}