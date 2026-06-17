class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        // if(arrivalTime+delayedTime>=24) return (arrivalTime+delayedTime)-24;
        //  else return arrivalTime+delayedTime;
        int total=0;
        total=arrivalTime+delayedTime;
        if(total==24){
            return 0;
        }
        return total%24;
    }
}
    