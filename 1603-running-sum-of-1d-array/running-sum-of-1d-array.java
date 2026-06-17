class Solution {
    public int[] runningSum(int[] nums) {
        // for(int i=1;i<nums.length;i++)
        // {
        //     nums[i]=nums[i]+nums[i-1];//nums[i]+=nums[i-1];
        // }
        // return nums;
        int sum = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}