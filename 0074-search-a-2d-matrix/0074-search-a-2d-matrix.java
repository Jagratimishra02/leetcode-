class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // using binary search
       int m = matrix.length;
       int n = matrix[0].length;
       int lo = 0;
       int hi = m*n-1;
       while(lo <= hi){
        int mid = lo + (hi - lo)/2;
       int midrow = mid/n;
       int midcol = mid%n;
        if(matrix[midrow][midcol] == target) return true;
        else if(matrix[midrow][midcol] < target) lo = mid+1;
        else hi = mid-1;
       }
       return false;
    }
}