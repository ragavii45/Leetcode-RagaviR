// Last updated: 11/08/2026, 14:17:11
class Solution {
    public int subtractProductAndSum(int n) {
       int d;
       int sum=0;
       int pro=1;
       while(n!=0){
        d=n%10;
        sum+=d;
        pro*=d;
        n=n/10;
       } 
       return pro-sum;
    }
}