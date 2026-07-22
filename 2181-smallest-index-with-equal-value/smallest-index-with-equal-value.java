class Solution {
    public int smallestEqual(int[] nums) {
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                //min=Math.min(nums[i],min);
                return i;
               
            }
        }
        return -1;
        
    }
}