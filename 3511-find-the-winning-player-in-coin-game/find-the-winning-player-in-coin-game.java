class Solution {
    public String winningPlayer(int x, int y) {
        //    while(!(x>1&&y<4))
        //    {
        //     if(x+y==115)
        //     {
        //         return "Alice";
        //     }
        //     x--;
        //     y-=4;
        //    }
        //    return "Bob";
        int count=0;
        while(!(x<1||y<4))
        {
            x--;
            y-=4;
            count++;
        }
        if(count%2==1)
        {
            return "Alice";
        }
        return "Bob";
    }
}