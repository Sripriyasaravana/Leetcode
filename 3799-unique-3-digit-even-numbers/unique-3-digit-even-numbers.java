class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        boolean[] visited = new boolean[1000];
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j&&j!=k&&k!=i){
                         int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                       if (digits[i] != 0 && num % 2 == 0 && !visited[num]) {
                          visited[num] = true;
                          count++;
                    }
                }
            }
            }
        }
    return count;    
    }
}