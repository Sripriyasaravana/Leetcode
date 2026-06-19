class Solution {
    public String maximumOddBinaryNumber(String s) {
    int sum=0;
    int sum1=0;
    for(int i=0;i<s.length();i++)
     //char[] arr = s.toCharArray();
     {
        if(s.charAt(i)=='1')
        {
            sum++;
        }
        else
        {
            sum1++;
        }
    }
        String ans="";
        for(int j=0;j<sum-1;j++)
        {
            ans+="1";
        }
        for(int k=0;k<sum1;k++)
        {
            ans+="0";
           
        }
     ans+="1";
    return ans;

    }
}