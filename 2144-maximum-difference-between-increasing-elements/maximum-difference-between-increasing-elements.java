class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=-1;
        int sub=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                   sub=nums[j]-nums[i];
                    if(sub>max){
                    max=sub;
                }
                }
               
            }
        }
        return max;
        
    }
}