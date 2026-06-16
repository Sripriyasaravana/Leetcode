class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = event2[0].compareTo(event1[1]);
        int s2 = event2[1].compareTo(event1[0]);
        return (s1 <= 0) && (s2 >= 0);
    }
}