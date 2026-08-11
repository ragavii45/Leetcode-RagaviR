// Last updated: 11/08/2026, 14:14:20
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int[] nl = nums;
        int n = nl.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int e=0;
            int o=0;
            for(int j=i;j<n;j++){
                if(nl[j]%2==0)
                    e++;
                else 
                    o++;
                if(o>0 && (long)e*b<=(long)o*a){
                    ans++;
                }
            }
        }
        return ans;
    }
}