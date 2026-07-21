class Solution {
    public String reverseByType(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(ch[left]))
                left++;
            while (left < right && !Character.isLetter(ch[right]))
                right--;
            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        // Reverse special characters
        left = 0;
        right = ch.length - 1;

        while (left < right) {

            while (left < right && Character.isLetter(ch[left]))
                left++;

            while (left < right && Character.isLetter(ch[right]))
                right--;

            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        return new String(ch);
    }
}
        