class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        dp = new int[rows][cols];
        for(int[] row: dp)
        Arrays.fill(row,-1);
        return solve(grid,rows-1,cols-1);
    }
    private int solve (int[][] grid , int row , int col){
        if (row<0 || col<0)
        return Integer.MAX_VALUE;

        if (row == 0 && col == 0)
        return grid[0][0];
        if (dp[row][col] != -1)
        return dp[row][col];

        int fromTop = solve(grid,row-1,col);
        int fromLeft = solve(grid,row,col-1);
        int minimum = Math.min(fromTop,fromLeft);
        if (minimum == Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        dp[row][col] = grid[row][col] + minimum;
        return dp[row][col];
    }
}