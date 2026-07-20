

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int multiple=k;
while (i < nums.length) {

    if (nums[i] == multiple) {
        i++;
        multiple += k;
    }
    else if (nums[i] < multiple) {
        i++;
    }
    else {
        return multiple;
    }
}

return multiple;
    }
}