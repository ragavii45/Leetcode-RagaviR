// Last updated: 11/08/2026, 14:13:58
class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD =1000000007L;
        long r =k;
        long o=0;
        long a=0;
        for(int x: nums){
            if(r<x){
                long need =(x-r+k-1L)/k;
                long f=o+1;
                long l=o+need;
                if((need &1)==0){
                    a=(a+((need/2)%MOD)*((f+l)%MOD))%MOD;
                }else{
                    a=(a+(need%MOD)*(((f+l)/2)%MOD))%MOD;
                }
                o+=need;
                r+=need*(long)k;
            }
            r-=x;
        }
        return (int)a;
    }
}