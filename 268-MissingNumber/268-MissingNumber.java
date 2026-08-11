// Last updated: 11/08/2026, 14:22:19
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        int f;
        int ans;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        f=n*(n+1)/2;
        ans=f-s;
        return ans;
    }
}