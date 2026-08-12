// Last updated: 12/08/2026, 21:38:43
class Solution {
    public void sortColors(int[] nums) {
       int c0=0,c1=0,c2=0;
        int i;
        int n= nums.length;
        for(i=0;i<n;i++){
         if(nums[i]==0)
          c0++;
          else if(nums[i]==1)
            c1++;
             else
               c2++;
               }
               for(i=0;i<c0;i++)
                 nums[i]=0;
                 for(i=c0;i<c0+c1;i++)
                  nums[i]=1;
                  for(i=c0+c1;i<n;i++)
                    nums[i]=2;
                    for(i=0;i<n;i++)
                      System.out.print(nums[i]+" ");
                      
    } 
    
}