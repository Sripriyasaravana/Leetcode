class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    int dis=j-i-1;
                    if(dis!=distance[s.charAt(i)-'a']){
                        return false;
                    }
                    break;
                }
            }
    }
        return true;
    }
}
