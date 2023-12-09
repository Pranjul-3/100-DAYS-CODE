class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int at=arrivalTime+delayedTime;
        if(at>=24)
        {
         at=at-24;
        }
        return at;
    }
}