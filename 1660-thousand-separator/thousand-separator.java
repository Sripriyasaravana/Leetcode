class Solution {
    public String thousandSeparator(int n) {
        String s=String.valueOf(n);
        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            result.insert(0,s.charAt(i));
            count++;
            if(count==3&&i!=0){
                result.insert(0,'.');
                count=0;
            }
        }
        return(result.toString());
    }
}