class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
           dp = new int[rows][cols];

        if (obstacleGrid[0][0] == 1) return 0;
        for(int[] row: dp){
        Arrays.fill(row,-1);
        }
        return solve(obstacleGrid,rows-1,cols-1);


    }
    private int solve(int[][] grid , int row, int col){
        if (row < 0 || col < 0) return 0;
        if (row == 0 && col == 0) return 1;
        if (grid[row][col]== 1) return 0;
        if (dp[row][col] != -1) return dp[row][col];
         int fromTop = solve(grid,row-1,col);
        int fromLeft = solve(grid,row,col-1); 
        dp[row][col] = fromTop + fromLeft;
        return dp[row][col];
    }
}