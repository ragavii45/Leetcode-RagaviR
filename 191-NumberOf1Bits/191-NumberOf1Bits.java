// Last updated: 12/08/2026, 21:36:01
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
        n=n&(n-1);
        count++;
        }
        return count;
    }
}