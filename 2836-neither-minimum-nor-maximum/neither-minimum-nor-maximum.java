class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3)//if(nums.length<=2)
        {
            return-1;
        }
        Arrays.sort(nums);
        return nums[1];
        
    }
}