class Solution {
    public int distinctIntegers(int n) {
        int count=0;
        if(n==1)
        {
            return n;
        }
        for(int i=1;i<n;i++)
        {
            if(n%i==1||n%1!=1)
            {
                count++;
            }
        }
        return count;
        //return n-1;
    }
}