class Solution {
    public boolean canAliceWin(int n) {
        int Alice=10;
        int count=0;
        while(n>=Alice){
            n=n-Alice;
            Alice--;
            count++;
        }
        if(count%2==1){
            return true;
        }
        return false;
        
    }
}