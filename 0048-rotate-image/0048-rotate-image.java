class Solution {
    public void rotate(int[][] matrix) {
     for(int i = 1 ; i < matrix.length ; i++) {
        for(int j = 0 ; j<i ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }
     for(int i = 0 ; i < matrix.length ; i++){
        int startcol = 0 ; 
        int endcol = matrix[0].length-1 ;
        while(startcol < endcol){
            int temp = matrix[i][startcol];
            matrix[i][startcol] = matrix[i][endcol];
            matrix[i][endcol] = temp;
            startcol++;
            endcol--;
        }
       } 
    }
}