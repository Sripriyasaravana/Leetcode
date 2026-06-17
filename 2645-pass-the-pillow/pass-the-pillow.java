class Solution {
    public int passThePillow(int n, int time) {
        int current=time/(n-1);
        int direction=time%(n-1);
        int ans=0;
        if(current%2!=0)
        {
            ans=n-direction;
        }
        else
        {
            ans=1+direction;
        }
        return ans; 
    }
}
// int current=1;
// int direction=1;
// for(int i=1;i<=time;i++)
// {
//     if(current==n)
//     {
//         direction=-1;
//     }
//     else if(current==1)
//     {
//         direction=1;
//     }
//     current+=direction;
// }
// return current;
//     }
// }