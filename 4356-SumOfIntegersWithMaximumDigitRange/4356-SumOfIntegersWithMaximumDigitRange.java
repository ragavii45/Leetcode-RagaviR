// Last updated: 11/08/2026, 14:13:54
class Solution {
    public int maxDigitRange(int[] nums) {
        int mr=-1;
        int sum=0;
        for(int num:nums){
            int t=num;
            int l=0;
            int s=9;
            while(t>0){
                int d=t%10;
                if(d>l)
                    l=d;
                if(d<s)
                    s=d;
                t/=10;
            }
            int r=l-s;
            if(r>mr){
                mr=r;
                sum=num;
            }else if(r==mr){
                sum+=num;
            }
        }
        return sum;
    }
}
