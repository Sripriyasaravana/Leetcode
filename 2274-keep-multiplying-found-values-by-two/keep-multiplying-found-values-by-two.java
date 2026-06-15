class Solution {
    public int findFinalValue(int[] nums, int original) {
        while (true) {

            boolean found = false;

            for (int num : nums) {
                if (num == original) {
                    original = original * 2;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return original;
            }
        }
    }
}
        
    