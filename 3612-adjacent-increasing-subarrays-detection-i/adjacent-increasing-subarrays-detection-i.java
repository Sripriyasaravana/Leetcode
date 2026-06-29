class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        int prevLen = 0;
        int currLen = 1;

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) > nums.get(i - 1)) {
                currLen++;
            } else {
                prevLen = currLen;
                currLen = 1;
            }

            if (currLen >= 2 * k || (currLen >= k && prevLen >= k)) {
                return true;
            }
        }

        return false;
    }
}