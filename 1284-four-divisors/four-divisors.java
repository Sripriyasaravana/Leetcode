// class Solution {
//     public int sumFourDivisors(int[] nums) {
//         int count=0;
//         int sum=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int c=0;
//             int s=0;
//             for(int j=1;j<=nums[i];j++)
//             {
//                 if(nums[i] % j == 0) {
//                     c++;
//                     s+= j;
//                 }
//             }

//             if(c == 4) {
//                 count+=c;
//                 sum += s;
//             }
//         }

//         return sum;
//     }
// }

class Solution {
    public int sumFourDivisors(int[] nums) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {

            int c = 0;
            int s = 0;

            for(int j = 1; j <= nums[i]; j++) {  

                if(nums[i] % j == 0) {
                    c++;
                    s += j;
                }

                if(c > 4) break;
            }

            if(c == 4) {
                sum += s;
            }
        }

        return sum;
    }
}