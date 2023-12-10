class Solution {
    public boolean stoneGame(int[] piles) {
        int a=0;
        for(int i=0; i<piles.length; i=i+2){
            a=a+piles[i];
        }
        int b=0;
        for(int i=1; i<piles.length; i=i+2){
            b=b+piles[i];
        }
        int a1=0;
        for(int i=piles.length-1; i>=0 ; i=i-2){
            a1=a1+piles[i];
        }
        int b1=0;
        for(int i=piles.length-2; i>=0 ; i=i-2){
            b1=b1+piles[i];
        } 
   boolean res = (a>b || a1>b1); 
        return res;
  
    }
}












/** class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
} **/