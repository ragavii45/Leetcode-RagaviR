// Last updated: 12/08/2026, 21:37:28
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int i;
        int x=0;
        for(i=0;i<n;i++)
          x=x^nums[i];
          return x;
    }
}