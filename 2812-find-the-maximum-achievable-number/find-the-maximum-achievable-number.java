class Solution {
    public int theMaximumAchievableX(int num, int t) {
     if(num>=0)
        {
            num=num+(t*2);
        }
        return num;   
    }
}