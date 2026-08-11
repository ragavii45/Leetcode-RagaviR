// Last updated: 11/08/2026, 14:15:56
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
            c++;
        }
        return c;
    }
}