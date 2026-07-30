class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            int count1 = 0;

            for (int j = 0; j < brokenLetters.length(); j++) {

                for (int k = 0; k < words[i].length(); k++) {

                    if (words[i].charAt(k) == brokenLetters.charAt(j)) {
                        count1 = 1;
                        break;
                    }
                }

                if (count1 == 1) {
                    break;
                }
            }

            if (count1 == 0) {
                count++;
            }
        }

        return count;
    }
}