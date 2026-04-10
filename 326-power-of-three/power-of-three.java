class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467; 
        return n > 0 && maxPowerOf3 % n == 0;
    }
}
//         int power=1;
//         while(power*3<=n)
//         {
//             power=power*3;

//         }
//         return power==n;
//     }
// }