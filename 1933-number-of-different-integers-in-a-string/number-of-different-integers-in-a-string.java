class Solution {
    public int numDifferentIntegers(String word) {
        String[] arr = new String[word.length()];
        int size = 0;
        int i = 0;
        while (i < word.length()) {
            if (Character.isDigit(word.charAt(i))) {
                String num = "";
                while (i < word.length() && Character.isDigit(word.charAt(i))) {
                    num += word.charAt(i);
                    i++;
                }
                while (num.length() > 1 && num.charAt(0) == '0') {
                    num = num.substring(1);
                }
                int found = 0;
                for (int j = 0; j < size; j++) {
                    if (arr[j].equals(num)) {
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    arr[size] = num;
                    size++;
                }
            } else {
                i++;
            }
        }
        return size;
    }
}