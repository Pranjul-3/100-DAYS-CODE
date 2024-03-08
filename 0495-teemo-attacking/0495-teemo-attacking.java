class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
       int newHigh = Integer.MIN_VALUE, ans = 0;
        for(int i=0; i<timeSeries.length; i++){
            if(timeSeries[i]<=newHigh){
                int end = timeSeries[i]+duration-1;
                ans+=(end-newHigh);
                newHigh = end;
            }else{
                int end = timeSeries[i]+duration-1;
                ans+=(end-timeSeries[i]+1);
                newHigh = end;
            }
        }
        return ans;
    }
}