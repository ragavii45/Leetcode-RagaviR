// Last updated: 11/08/2026, 14:14:04
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int cn=mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            long a=nums[i];
            long m=1L*nums[i]*cn;
            ans+=Math.max(a,m);
            cn--;
        }
        return ans;
    }
}