// Last updated: 11/08/2026, 14:20:28
class Solution {
    public int findComplement(int num) {
        int m=0;
        int temp = num;
        while(temp>0){
            m=m<<1|1;
            temp>>=1;
        }
        return (num^m);
    }
}