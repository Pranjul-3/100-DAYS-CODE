class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        for(int i=0;i<len;i++){
             for(int j=0;j<matrix[i].length;j++){
                 if(matrix[i][j] == target) return true;
                 if(matrix[i][j] > target) return false;
             }
        }
       return false; 
    }
}