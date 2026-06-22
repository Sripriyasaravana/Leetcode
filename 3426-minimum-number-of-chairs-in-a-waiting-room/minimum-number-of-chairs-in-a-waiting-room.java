class Solution {
    public int minimumChairs(String s) {
        int current=0;
        int max=0;
        for(char ch:s.toCharArray())
        {
            if(ch =='E')
            {
                current++;
            if(current>max)
            {
                max=current;
            }
            }
            else
            {
                current--;
            }
        }
    return max;
        
    }
}