class Solution {
    public boolean isSameAfterReversals(int num) {
       // int n=sc.nextInt();
        int rev1=0;
        int temp=num;
        while(temp>0)
        {
            int digits=temp%10;
            rev1=rev1*10+digits;
            temp=temp/10;
        }
        int rev2=0;
        temp=rev1;
        while(temp>0)
        {
            
            int digits=temp%10;
            rev2=rev2*10+digits;
            temp=temp/10;
        
        }
        if(rev2==num)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}