class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            int count1=0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)=='0')
                {
                    count++;
                }
                else
                {
                    count1++;
                }
            
            if(count<=k||count1<=k)
            {
                sum++;
            }
        }
        }
        return sum;
        
    }
}