// Last updated: 12/08/2026, 21:41:14
class Solution {
    public int reverse(int x) {
        int d;
        long ans=0;
        while(x!=0){
            d=x%10;
            ans=ans*10+d;
            x=x/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
        return 0;
        }
        return (int)ans;
    }
    }