class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>ans = new ArrayList<>();
       int n = matrix[0].length , m = matrix.length ; 
       int firstRow = 0 ;
       int LastRow = m-1;
       int firstCol = 0;
       int LastCol = n-1;

       // method 1
    //    int tne = m*n;
    //    while(ans.size()<tne){

    //     // for right 
    //     for(int i = firstCol ; i <= LastCol; i++){
    //         ans.add(matrix[firstRow][i]);
    //     }
    //     firstRow++;
    //     if(ans.size()==tne) break;   // if first  row or col is greater then row or col break.

    //     // for down
    //     for(int j = firstRow ; j <= LastRow ; j++){
    //         ans.add(matrix[j][LastCol]);
    //     }
    //     LastCol--;
    //     if(ans.size()==tne) break;

    //     // for left
    //     for(int i = LastCol ; i >= firstCol ; i--){
    //         ans.add(matrix[LastRow][i]);
    //     }
    //     LastRow--;
    //     if(ans.size()==tne) break;

    //     // for up
    //     for(int j = LastRow ; j >= firstRow ; j--){
    //         ans.add(matrix[j][firstCol]);
    //     }
    //     firstCol++;
    //     if(ans.size()==tne) break;
    //    }

    // method 2
       while(firstRow<=LastRow && firstCol <= LastCol){

        // for right 
        for(int i = firstCol ; i <= LastCol; i++){
            ans.add(matrix[firstRow][i]);
        }
        firstRow++;
        if(firstRow>LastRow || firstCol>LastCol) break;

        // for down
        for(int j = firstRow ; j <= LastRow ; j++){
            ans.add(matrix[j][LastCol]);
        }
        LastCol--;
        if(firstRow>LastRow || firstCol>LastCol) break;

        // for left
        for(int i = LastCol ; i >= firstCol ; i--){
            ans.add(matrix[LastRow][i]);
        }
        LastRow--;
        if(firstRow>LastRow || firstCol>LastCol) break;

        // for up
        for(int j = LastRow ; j >= firstRow ; j--){
            ans.add(matrix[j][firstCol]);
        }
        firstCol++;
        if(firstRow>LastRow || firstCol>LastCol) break;
       }
       return ans;
    }
}