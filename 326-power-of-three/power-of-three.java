class Solution {
    public boolean isPowerOfThree(int n) {
        // int maxPowerOf3 = 1162261467; 
        // return n > 0 && maxPowerOf3 % n == 0;
        if(n <= 0) return false;

        int temp = n;

        while(temp % 3 == 0) {
            temp /= 3;
        }

        return temp == 1;
    }
}