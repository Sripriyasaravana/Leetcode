class Solution {
    public int arrangeCoins(int n) {
        // int i=1;
        // while(n>0)
        // {
        //     i++;
        //     n=n-i;
        // }
        // return i-1;
      

        int row = 1;
        int count = 0;

        while (n >= row) {
            n = n - row;
            count++;
            row++;
        }

        return count;
    }
}
        
    