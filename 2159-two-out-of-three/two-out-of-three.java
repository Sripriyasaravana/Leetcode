class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for (int x : nums1)
            set1.add(x);

        for (int x : nums2)
            set2.add(x);

        for (int x : nums3)
            set3.add(x);

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            int count = 0;

            if (set1.contains(i))
                count++;

            if (set2.contains(i))
                count++;

            if (set3.contains(i))
                count++;

            if (count >= 2)
                ans.add(i);
        }

        return ans;
        
    }
}