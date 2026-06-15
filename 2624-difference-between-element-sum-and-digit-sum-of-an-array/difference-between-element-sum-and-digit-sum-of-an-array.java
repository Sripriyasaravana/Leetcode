// class Solution {
//     public int differenceOfSum(int[] nums) {
//         int elementsum=0;
//         int digitsum=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             elementsum+=nums[i];
//         }
//         for(int i=0;i<nums.length;i++){
        
//         while(nums[i]!=0)
//         {
//         int rem=nums[i]%10;
//         digitsum +=rem;
//         nums[i]/=10;
//         }
//         } 
//         return elementsum-digitsum;
//     }
// }
                         
                         class Solution {
    public int differenceOfSum(int[] nums) {
       int elementSum = 0;
       int digitSum = 0;
       for(int num : nums){
           elementSum += num;
           while(num > 0){
            digitSum += num % 10;
            num= num / 10;
           }

        }
        return elementSum - digitSum;
    }
}