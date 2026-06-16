class Solution {
    public int distinctIntegers(int n) {
        int count=0;
        if(n==1)
        {
            return n;
        }
        // for(int i=1;i<n;i++)
        // {
        //     if(n%2==1||n%4!=1)//if(n%i==1||n%i!=1)
        //     {
        //         count++;
        //     }
        // }
        // return count;
        return n-1;
    }
}