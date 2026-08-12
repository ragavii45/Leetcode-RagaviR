// Last updated: 12/08/2026, 21:41:11
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
      int d;
      int ans=0;
      if(x>=0){
      while(x!=0){
        d=x%10;
        ans=ans*10+d;
        x=x/10;
      } 
      }
      if(temp==ans)
      return true;
      else
      return false; 

    }
}