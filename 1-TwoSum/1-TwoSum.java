// Last updated: 12/08/2026, 21:41:30
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int n=nums.length;
        int ans[]=new int[2];

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++)

            if(nums[i]+nums[j]==target){
            
            return new int[]{i,j};
            } 
        }
        return new int []{};
    }
}