class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        return replace(matrix,0,0);
    }
    public static int[][] replace(int [][]matrix, int row, int col){
        if(row==matrix.length)
            return matrix;
        if(col==matrix[row].length)
            return replace(matrix, row+1, 0);
        if(matrix[row][col]==-1){
            matrix[row][col]=max(matrix,0,col);
        }
        return replace(matrix, row, col+1);
    }
    public static int max(int [][]matrix, int row, int col){
        int []colElements=new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
            colElements[i]=matrix[i][col];
        Arrays.sort(colElements);
        return colElements[colElements.length-1];
    }
}
