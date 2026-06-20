class Solution {
    public String reverseWords(String s) {
       // String[] words = s.split(" ");
    //     StringBuilder result = new StringBuilder();
        
    //     for (String word : words) {
    //         result.append(new StringBuilder(word).reverse()).append(" ");
    //     }
        
    //     return result.toString().trim();
String[] arr = s.split(" ");
    String result="";
    for(String word:arr)
    {
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rev +=word.charAt(i);

        }
        result+=rev+" ";
    }
    return result.trim();
    }
}
        
