class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        // Selection Sort approach - O(n²) time, O(1) space
        
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;  // Track index of minimum element
            
            // Find minimum element in remaining unsorted array
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap nums[i] and nums[minIndex]
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        
        // void function - no return statement needed!
    }
}