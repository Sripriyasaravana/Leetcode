class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum1=0;
       // int i=nums.length();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=9)
            {
                sum+=nums[i];
            }
            else if(nums[i]>=10)
            {
                sum1+=nums[i];
            }
        }
        return sum !=sum1;
        
    }
}