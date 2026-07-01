class Solution {
    public int convertTime(String current, String correct) {
        int cur = Integer.parseInt(current.substring(0, 2)) * 60
                + Integer.parseInt(current.substring(3));

        int cor = Integer.parseInt(correct.substring(0, 2)) * 60
                + Integer.parseInt(correct.substring(3));

        int diff = cor - cur;
        int ans = 0;
        ans += diff / 60;
        diff %= 60;
        ans += diff / 15;
        diff %= 15;
        ans += diff / 5;
        diff %= 5;
        ans += diff;
        return ans;
    }
}

        

        
    