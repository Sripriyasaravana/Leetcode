// class Solution {
//     public int distMoney(int money, int children) {
//         int moneyl=money-children;
//         if(moneyl<0){
//             return -1;
//         }
//         while(moneyl<=7){
//             if(moneyl/7==0&&moneyl%7==0){
//                 return children;
//             }
//             if(moneyl/7==children-1&&moneyl%7==3){
//                 return children -2;
//             }
//         }
//         return-1;
//     }
// }
class Solution {
    public int distMoney(int money, int children) {

        int moneyl = money - children;

        if (moneyl < 0) {
            return -1;
        }

        int count = 0;

        while (moneyl >= 7 && children > 0) {
            moneyl = moneyl - 7;
            children--;
            count++;
        }

        if (children == 0 && moneyl > 0) {
            return count - 1;
        }

        if (children == 1 && moneyl == 3) {
            return count - 1;
        }

        return count;
    }
}