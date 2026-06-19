class Solution {
    public int largestAltitude(int[] gain) {
//         int sum=0;
//         int max=0;
//         int n=gain.length;;
//         for(int i=0;i<n;i++)
//         {
//             sum+=gain[i];
//             if(sum>max)
//             {
//                 max=sum;
//             }
//         }
//         return max;
        
//     }
// }

int height=0;
int maxheight=0;
for(int g:gain)
{
   maxheight+=g;
   height=Math.max(height,maxheight);
 
}
return height;
}
}