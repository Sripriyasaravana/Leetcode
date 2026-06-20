class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sri=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
            {
                sri.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                sri.add("Fizz");
            }
             else if(i%5==0)
            {
                sri.add("Buzz");
            }
            else
            {
                sri.add(String.valueOf(i));
            }
        }
        return sri;

    }
}