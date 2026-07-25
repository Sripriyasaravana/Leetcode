class Solution {
    public int maxProduct(int n) {
        int product=0;
        int product1=0;
            while(n>0){
            int digits=n%10;
            if(digits>=product){
                product1=product;
                product=digits;
            }
            else if(digits>product1){
                product1=digits;
            }
            n/=10;
        }
        return product*product1;
        
    }
}