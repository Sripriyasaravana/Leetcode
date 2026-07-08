class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
              for(int j=0;j<n;j++){
                if(nums[i]==-nums[j]){
            max = Math.max(max,nums[i]);
            }
        }
            }
        }
        return max;
    }
}