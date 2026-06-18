class Solution {
    public int sumOfSquares(int[] nums) {
//         int n=nums.length;
//         int sum=0;
//         for(int i=0;i<n;i++)
//         {
//             if(n%(i+1)==0)
//             {
//                 sum+=nums[i]*nums[i];
//             }
//         }
//         return sum;

        
//     }
// }
int n=nums.length;
int sum=0;
int index=1;
for(int i=0;i<=n;i++)
{
    if(n%index==0)
    {
        sum+=nums[i]*nums[i];
    }
    index++;
}
return sum;
    }
}