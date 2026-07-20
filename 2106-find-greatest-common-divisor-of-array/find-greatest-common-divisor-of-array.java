class Solution {
    public int findGCD(int[] nums) {
       int n=nums.length;
       int s=nums[0];
       int b=nums[0];
       for(int i=1;i<n;i++){
        s=Math.min(s,nums[i]);
        b=Math.max(b,nums[i]);
       }
       while(b!=0){
        int temp=b;
        b=s%b;
        s=temp;
       }
       return s;
    }
}

        