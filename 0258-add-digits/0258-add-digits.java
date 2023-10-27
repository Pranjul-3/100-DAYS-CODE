class Solution {
    public int addDigits(int num) {
         while(num>9)
        { int s=0;
            while(num!=0)
            {
                int r=num%10;
                s=s+r;
                num=num/10;
              
                
                
            }
          num=s;
        }
       return num; 
    }
}