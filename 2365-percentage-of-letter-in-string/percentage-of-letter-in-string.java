class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        double ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
             ans=(count+0.0)/s.length()*100;

        }
        return (int)ans;
        
    }
}