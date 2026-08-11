// Last updated: 11/08/2026, 14:16:49
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int s=0;
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            s+=nums[i];
            arr[i]=s;
        }
        return arr;
    }
}