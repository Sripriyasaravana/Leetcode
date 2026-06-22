class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<=n-k;i++)
        {
            int max=0;
            for(int j=i;j<i+k;j++)
            {
                max+=nums[j];
            }
            if(max>sum)
            {
                sum=max;
            }
        }
        return(double)sum/k;
        
    }
}