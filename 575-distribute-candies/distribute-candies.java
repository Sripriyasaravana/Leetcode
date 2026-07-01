class Solution {
    public int distributeCandies(int[] candyType) {
        // Arrays.sort(candyType);
        // int count=1;
        // for(int i=1;i<candyType.length;i++)
        // {
        //     if(candyType[i]!=candyType[i-1])
        //     {
        //         count++;
        //     }
        // }
        // int n=candyType.length/2;
        // if(count<n){
        //     return count;
        // }
        // else{
        //     return n;
        // }
        int n = candyType.length;

        HashSet<Integer> unique = new HashSet<>();

        for(int candy : candyType){
            unique.add(candy);
        }

        if(unique.size() >= n / 2){
            return n / 2;
        }
        else{
            return unique.size();
        }
    }
}