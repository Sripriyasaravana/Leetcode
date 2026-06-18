class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<=n;i++)
        {
            if(i%m!=0)
            {
                sum+=i;
            }
            else
            {
                sum1 += i;
            }
        }
        return sum-sum1;
        
    }
}