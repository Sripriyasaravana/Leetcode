class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int product=1;
        int temp=n;
        while(temp>0){
            int digits=temp%10;
            product*=digits;
            temp/=10;
        }
        if(product%t==0){
        return n;
        }
        n++;
    }
}
}
