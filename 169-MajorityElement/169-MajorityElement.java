// Last updated: 12/08/2026, 21:36:47
class Solution {
    public int majorityElement(int[] nums) {
        int t=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0)
             t=nums[i];
            if(t==nums[i])
             c++;
            else
             c--;
        }
           return t;
    }
}