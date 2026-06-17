class Solution {
    public String trimTrailingVowels(String s) {
//         int n = s.length() - 1;

//         while (n>=0 && "aeiou".contains(s.substring(n,n+1))) {
//             n--;
//         }

//         return s.substring(0, n + 1);
//     }
// }


       

        int i = s.length() - 1;

        while (i >= 0 &&
              (s.charAt(i) == 'a' ||
               s.charAt(i) == 'e' ||
               s.charAt(i) == 'i' ||
               s.charAt(i) == 'o' ||
               s.charAt(i) == 'u')) {

            i--;
        }

        String output = "";

        for (int j = 0; j <= i; j++) {
            output += s.charAt(j);
        }

        return output;
    }
}