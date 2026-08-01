class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sum=0;
        for(int i=0;i<seats.length;i++){
           Arrays.sort(seats);
           Arrays.sort(students);
           sum+=Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}