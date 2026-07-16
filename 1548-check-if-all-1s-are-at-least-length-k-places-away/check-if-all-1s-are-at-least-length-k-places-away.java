class Solution {
    public boolean kLengthApart(int[] nums, int k) {
//         int count=k;
//         for(int n:nums)
//         {
//             if(n==1)
//             {
//                 if(count<k) return false;
            
//             count=0;
//         }
//         else
//         {
//             count++;
//         }
//         }
//         return true;
//     }
// }
             

int prev=-1;
boolean sri=true;
    for (int i=0;i<nums.length;i++) {
            if (nums[i]==1) {
                if (prev !=-1&&i-prev-1<k) {
                    sri= false;
                    break;
                }
                prev = i;
            }
        }
        return sri;
    }
}