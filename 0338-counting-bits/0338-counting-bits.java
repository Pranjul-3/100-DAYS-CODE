class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
        { int c=0,num=i;
          while(num>0)
          {
              if(num%2==1)
              {
                  c++;
              }
              num=num/2;

          }
          a[i]=c;
        }
    return a;
    }
}



