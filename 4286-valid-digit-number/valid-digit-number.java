// class Solution {
//     public boolean validDigit(int n, int x) {
//         String number = Integer.toString(n);

//         // Check if the first digit is x
//         if (number.charAt(0) - '0' == x) {
//             return false;
//         }

//         // Check if x is present in the number
//         for (int i = 0; i < number.length(); i++) {
//             if (number.charAt(i) - '0' == x) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

class Solution {
    public boolean validDigit(int n, int x) {
        boolean occurrenceX = false;
        while (n >= 10) {
            if (n % 10 == x) {
                occurrenceX = true;
            }
            n /= 10;
        }
        return occurrenceX && n != x;
    }
}