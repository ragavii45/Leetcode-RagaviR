// Last updated: 11/08/2026, 14:21:17
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
      while(n%4==0){
        n=n/4;
      }
      if(n==1)
      return true;
      else
      return false;
    }
}