// Last updated: 16/08/2026, 08:50:35
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int mg =0;
4        for(int l:lights){
5            mg = Math.max(mg,l);
6        }
7        int[][] v = new int[][]{lights,arrivalTime};
8        int a =0;
9        for(int t : arrivalTime){
10            int r = t%period;
11            if(r>= mg){
12                a = Math.max(a,period-r);
13            }
14        }
15        return a;
16    }
17}