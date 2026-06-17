// class Solution {
//     public String removeTrailingZeros(String num) {
//         int n = num.length() - 1;

//         while (n > 0 && num.charAt(n) == '0') {
//             n--;
//         }

//         return num.substring(0, n + 1);
//     }
// }
    // int i=s.length()-1;
    // while(s[i]==0)
    // {
    //     i--;
    // }
    // String output=" ";
    // for(int j=0;i<=i;j++)
    // {
    //     output+=s[i];

    // }
    
    class Solution {
    public String removeTrailingZeros(String num) {

        int i = num.length() - 1;
        while (i >= 0 && num.charAt(i) == '0') {//(s[i]==0&&i!=0)
            i--;
        }
        if (i == -1) { //if(i==0){ i--;}

            return "0";
        }
        String output = "";
        for (int j = 0; j <= i; j++) {
            output += num.charAt(j);
        }

        return output;
    }
}