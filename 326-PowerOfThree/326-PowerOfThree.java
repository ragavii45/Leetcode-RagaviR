// Last updated: 11/08/2026, 14:21:33
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
       while(n%3==0){
        n=n/3;
       } 
       if(n==1)
       return true;
       else
       return false;
    }
}