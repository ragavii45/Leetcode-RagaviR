// Last updated: 11/08/2026, 14:20:33
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int n=0;
        long e=Long.MIN_VALUE;
        for(int[] b: points){
            if(b[0]<=e)
               continue;
            else{
                n++;
                e=b[1];
            }  
        }
        return n;
    }
}