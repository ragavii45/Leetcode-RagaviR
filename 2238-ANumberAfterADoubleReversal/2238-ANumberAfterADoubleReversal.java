// Last updated: 11/08/2026, 14:16:14
class Solution {
    public boolean isSameAfterReversals(int num) {
        // if(num==0)
        // return true;
        //  else if(num%10==0)
        // return false;
        // else
        // return true;

        return (num%10!=0 || num==0)? true:false;
    }
}