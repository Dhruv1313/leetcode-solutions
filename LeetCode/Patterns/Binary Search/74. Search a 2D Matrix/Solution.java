class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      int low=0;
      int high=n*m-1;
      while(low<=high){
        int mid = (low+high)/2;
        int row=mid/m;
        int col=mid%m;
        if(matrix[row][col]==target)
        return true;
        else if (matrix[row][col]<target)
        low = mid+1;
        else high=mid-1;
      }
      return false;
    }
}

class Main{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,5},
            {33,55,66},
            {68,71,76}
        };
        Solution sol = new Solution();
        if(sol.searchMatrix(matrix,55))
        System.out.println("True");
        else 
        System.out.println("False");
    }
}