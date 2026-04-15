class Solution {
    public int[] numberGame(int[] nums) {
        int [] n=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2)
        {
            n[i]=nums[i+1];
            n[i+1]=nums[i];
        }
        return n;
    }
}