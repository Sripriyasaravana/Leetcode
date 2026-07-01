class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int time1=events[0][1];
        int time2=events[0][0];
        int duration=0;
        for(int i=1;i<events.length;i++){
            duration=events[i][1]-events[i-1][1];
            if(duration>time1){
                time1=duration;
                time2=events[i][0];
            }
            else if(duration==time1){
                time2=Math.min(time2,events[i][0]);
            }
        }
        return time2;
        
    }
}