// Last updated: 12/08/2026, 21:35:44
class Solution {
    public boolean isHappy(int n) {
        int sum;
        while(n!=1 && n!=4){
             sum=0;
        while(n!=0){
           int d=n%10;
            sum =sum+(d*d);
            n/=10;
          }
          n=sum;
        }
        if(n==1)
         return true;
        else
         return false;
    }
}