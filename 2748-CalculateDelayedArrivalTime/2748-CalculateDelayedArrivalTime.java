// Last updated: 11/08/2026, 14:15:22
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
        // int t=arrivalTime+delayedTime;
        // if(t<24)
        //  return t;
        // else 
        //  return 0;
    }
}