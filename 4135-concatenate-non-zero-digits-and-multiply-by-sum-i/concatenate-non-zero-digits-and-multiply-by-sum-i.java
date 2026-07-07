// class Solution {
//     public long sumAndMultiply(int n) {
//         if (n == 0)
//             return 0;
//         int temp = n;
//         int rev = 0;

//         // Form x in reverse order
//         while (temp > 0) {
//             int digit = temp % 10;

//             if (digit != 0) {
//                 rev = rev * 10 + digit;
//             }

//             temp /= 10;
//         }

//         int x = 0;
//         int sum = 0;

//         // Reverse again to get original order
//         while (rev > 0) {
//             int digit = rev % 10;
//             x = x * 10 + digit;
//             sum += digit;
//             rev /= 10;
//         }

//         return x * sum;
//     }
// }


class Solution {
    public long sumAndMultiply(int n) {
        long x = 0,sum = 0,len = 1;
        while(n != 0){
            x = (n % 10) * len + x;
            if(n % 10 != 0) len = len * 10;
            sum += n % 10;
            n = n / 10;
        }
        return sum * x;
    }
}
        
