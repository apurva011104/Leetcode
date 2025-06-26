class Solution {
    public void solveSudoku(char[][] bo) {
        int[][]board=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(bo[i][j]=='.'){
                    board[i][j]=0;
                }
                else {
                    board[i][j]=bo[i][j]-'0';
                }
            }
        }
        solving(board,0,0,bo);
    }
    public static void solving(int[][]board,int row, int col, char[][]bo){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    String str=Integer.toString(board[i][j]);
                    bo[i][j]=str.charAt(0);
                }
                System.out.println();
            }
            return;
        }
        if(board[row][col]!=0)
            solving(board,row,col+1,bo);
        else {
            for(int i=1;i<=9;i++){
                if(isPossible(row,col,board,i)){
                    board[row][col]=i;
                    solving(board,row,col+1,bo);
                    board[row][col]=0;
                }
            }
        }

    }
    public static boolean isPossible(int row, int col, int[][]board, int num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num)
                return false;
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==num)
                return false;
        }
        int sr=row-(row%3);
        int er=row+(2-(row%3));
        int sc=col-(col%3);
        int ec=col+(2-(col%3));
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                if(board[i][j]==num)
                    return  false;
            }
        }
        return  true;
    }
}
