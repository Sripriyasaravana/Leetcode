class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length() - 1;

        while (n>=0 && "aeiou".contains(s.substring(n,n+1))) {
            n--;
        }

        return s.substring(0, n + 1);
    }
}