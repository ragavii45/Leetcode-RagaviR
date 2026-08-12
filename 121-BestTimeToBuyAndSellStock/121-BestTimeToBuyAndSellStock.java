// Last updated: 12/08/2026, 21:37:43
class Solution {
    public int maxProfit(int[] prices) {
        int i,j;
        int n=prices.length;
        int max=Integer.MAX_VALUE;
        int ans=0;
        int pr;
        for(i=0;i<n;i++){
            if(prices[i]<max){
            max=prices[i];}
            else{
                pr=prices[i]-max;
                if(pr>ans)
                ans=pr;
            }

        }
       
        return ans;
    }
}