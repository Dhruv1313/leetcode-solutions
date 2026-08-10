class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        dp= new int[rows][rows];
        for(int[] row : dp)
        Arrays.fill(row,-1);
        return solve(triangle, 0,0);
    }
    private int solve(List<List<Integer>> triangle , int row, int col){
        if (row == triangle.size()-1)
        return triangle.get(row).get(col);
        if (dp[row][col] != -1)
        return dp[row][col];
        int top = solve(triangle,row+1,col);
        int diagonal = solve(triangle,row+1,col+1);
        dp[row][col] = triangle.get(row).get(col) + Math.min(top,diagonal);
        return dp[row][col];
    }
}