class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0;i<maxLocal.length;i++) {
            for(int j=0;j<maxLocal[i].length;j++) {
                maxLocal[i][j] = max(i,j,grid);
            }
        }
        return maxLocal;
    }
    private int max(int i,int j,int[][] grid) {
        int max = 0;
        for(int r=i;r<=i+2;r++) {
            for(int c=j;c<=j+2;c++) {
                if(max < grid[r][c]) {
                    max = grid[r][c];
                }
            }
        }
        return max;
    }
}