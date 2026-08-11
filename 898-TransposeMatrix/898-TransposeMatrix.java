// Last updated: 11/08/2026, 14:18:42
class Solution {
    public int[][] transpose(int[][] matrix) {
        int i=0;
        int j=0;
        int m=matrix.length;
        int n=matrix[i].length;
        int arr[][]=new int[n][m];
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
              arr[i][j]=matrix[j][i];
            }
        }
                return arr;
    }
}