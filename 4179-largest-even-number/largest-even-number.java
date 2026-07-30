class Solution {
    public String largestEven(String s) {
      
        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 == 0) {
                ans = s.substring(0, i + 1);
                break;
            }
        }

        return ans;
    }
}
        
    