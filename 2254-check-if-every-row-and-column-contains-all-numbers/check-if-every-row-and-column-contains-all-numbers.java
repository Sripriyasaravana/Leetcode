class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(matrix[i][j]==matrix[i][k]){
                        return false;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i+1;k<n;k++){
                    if(matrix[i][j]==matrix[k][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}