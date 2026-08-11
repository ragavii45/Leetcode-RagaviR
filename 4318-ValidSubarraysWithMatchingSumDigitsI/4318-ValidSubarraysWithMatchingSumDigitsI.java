// Last updated: 11/08/2026, 14:14:23
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        long[] p = new long[n+1];
        for(int i=0;i<n;i++){
            p[i+1]=p[i]+nums[i];
        }
        int c=0;
        for(int l=0;l<n;l++){
            for(int r=l;r<n;r++){
                long s=p[r+1]-p[l];
                if(s%10!=x) continue;
                long t=s;
                while(t>=10){
                    t/=10;
                }
                if(t==x){
                    c++;
                }
            }
        }
        return c;
    }
}