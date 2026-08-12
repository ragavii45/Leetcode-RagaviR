// Last updated: 12/08/2026, 21:39:00
class Solution {
public:
    int climbStairs(int n) {
        if(n==1)
        return n;
        int p1=1;
        int p2=1;
        int c;
        for(int i=2;i<=n;i++){
         c=p1+p2;
         p2=p1;
         p1=c;
        }
        return p1;
    }
};