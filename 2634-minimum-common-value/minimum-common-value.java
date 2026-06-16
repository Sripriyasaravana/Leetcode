class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // for(int i = 0; i < n1; i++){
        //     for(int j = 0; j <n2; j++){
        //         if(nums1[i] == nums2[j]){
        //             return nums1[i];
        //         }
                
        //     }
            

       // }
       int i=0;
       int j=0;
       while(i<nums1.length&&j<nums2.length)
       {
        if(nums1[i]==nums2[j])
        {
            return nums1[i];
        }
        if(nums1[i]<nums2[j])
        {
            i++;
        }else
        {
            j++;
        }
       }
        
        return -1;
        
    }
}