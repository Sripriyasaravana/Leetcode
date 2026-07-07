class Solution {
    public int captureForts(int[] forts) {
        int max=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1||forts[i]==-1){
                int count=0;
                for(int j=i+1;j<forts.length;j++){
                    if(forts[j]==0){
                        count++;
                    }
                    else {
                    if(forts[i]!=forts[j]){
                        max=Math.max(count,max);

                    }
                    break;
                    }
                    
                }
            }
        }
        return max;

    }
}