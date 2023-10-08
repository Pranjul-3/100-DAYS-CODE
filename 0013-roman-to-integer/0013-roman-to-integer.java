class Solution {
    public int symbol(char c)
    {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;
    }
    public int romanToInt(String s) {
              int h=0;
              int p=0;
          for(int i=s.length(); i>0; i--)
          {
              int a = symbol(s.charAt(i-1));
                  if(a<p)
                  {
                      h=h-a;
                      
                  }
              else
              {
                  h=h+a;
              }
              p=a;
    }
        return h;
}
}