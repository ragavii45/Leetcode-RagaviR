// Last updated: 11/08/2026, 14:15:47
class Solution {
    public int passThePillow(int n, int time) {
        int c=time/(n-1);
        int d=time%(n-1);
        return c%2==0?d+1:n-d;
    }
}