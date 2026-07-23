class Solution {
    public int search(int[] nums, int target) {
         int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         return i;
        //     }
        // }
        // return -1;
        int[]arr=nums;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}