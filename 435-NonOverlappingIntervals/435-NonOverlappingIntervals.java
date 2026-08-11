// Last updated: 11/08/2026, 14:20:43
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]==b[1]?b[0]-a[0]:a[1]-b[1]);
        int c=0;
        int e=Integer.MIN_VALUE;
        for(int[] m:intervals){
            if(m[0]>=e)
              e=m[1];
            else
             c++;
        }
        return c;
    }
}