class Solution {
    Integer[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        dp= new Integer[rows][rows];
        
        return solve(triangle, 0,0);
    }
    private int solve(List<List<Integer>> triangle , int row, int col){
        if (row == triangle.size()-1)
        return triangle.get(row).get(col);
        if (dp[row][col] != null)
        return dp[row][col];
        int top = solve(triangle,row+1,col);
        int diagonal = solve(triangle,row+1,col+1);
        dp[row][col] = triangle.get(row).get(col) + Math.min(top,diagonal);
        return dp[row][col];
    }
}