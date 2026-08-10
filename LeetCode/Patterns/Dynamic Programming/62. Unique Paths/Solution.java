class Solution {
    int[][] dp ;
    public int uniquePaths(int m, int n) {
        dp  = new int[m][n];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        return solve(m-1,n-1);
    }
    private int solve(int row, int col){
        if (row == 0 && col == 0) return 1;
        if (row < 0 || col < 0) return 0;
        if (dp[row][col] != -1) return dp[row][col];

        int fromTop = solve(row-1,col);
        int fromLeft = solve(row,col-1);
        dp[row][col] = fromTop + fromLeft;
        return dp[row][col];
    }
}