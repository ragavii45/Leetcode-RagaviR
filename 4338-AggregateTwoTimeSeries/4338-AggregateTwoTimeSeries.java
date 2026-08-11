// Last updated: 11/08/2026, 14:14:12
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        Object[] fl = new Object[]{series1,series2};
        List<List<Integer>> ans = new ArrayList<>();
        int i=0,j=0;
        int n = series1.length;
        int m = series2.length;
        while(i<n || j<m){
            int t;
            if(j==m || (i<n && series1[i][0] < series2[j][0])){
                t=series1[i][0];
            }else if(i==n || ( series2[j][0] < series1[i][0])){
                t=series2[j][0];
            }else{
                t=series1[i][0];
            }
            int v1 = (i<n)?series1[i][1] : 0;
            int v2 = (j<m)?series2[j][1] : 0;
            ans.add(Arrays.asList(t,v1+v2));
            if(i<n && series1[i][0]==t)i++;
            if(j<m && series2[j][0]==t)j++;
        }
        return ans;
    }
}