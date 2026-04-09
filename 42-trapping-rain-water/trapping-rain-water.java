// class Solution {
//     public int trap(int[] height) {
//         // int i=0;
        // int j=height.length-1;
        // int heighesti=height[i];
        // int heighestj=height[j];
        // int totalwater=0;
        // while(i<j)
        // {
        //     if(heighesti<=heighestj)
        //     {
        //         i++;
        //         totalwater+=heighesti-height[i];
        //     }
        //     else if(heighesti>heighestj)
        //     {
        //     j--;
        //     totalwater+=heighestj-height[j];
        // }
        // }
        // return totalwater;
//         
class Solution {

    public int trap(int[] arr) {

        int n = arr.length;

        int l = 0;
        int r = n - 1;

        int res = 0;
        int leftmax = 0;
        int rightmax = 0;

        while (l < r) {

            if (arr[l] < arr[r]) {

                if (leftmax <= arr[l]) {
                    leftmax = arr[l];
                } 
                else {
                    res += leftmax - arr[l];
                }

                l++;

            } 
            else {

                if (rightmax <= arr[r]) {
                    rightmax = arr[r];
                } 
                else {
                    res += rightmax - arr[r];
                }

                r--;
            }
        }

        return res;
    }
}