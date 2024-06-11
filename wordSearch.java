class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char w=word.charAt(0);
                if(board[i][j]==w)
                    if(check(board,i,j,0,word)){
                        return true;
                    }
            }
        }
        return false;
    }
    public static boolean check(char [][]board, int row, int col, int index, String word){
        if(index==word.length())
            return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(index)){
            return false;
        }
        int []r={0,1,0,-1};
        int []c={1,0,-1,0};
        boolean flag=false;
        for(int i=0;i<c.length;i++){
            char w=board[row][col];
            board[row][col]='*';
            flag=check(board, row +r[i],col+c[i],index+1,word);
            if(flag)
            return flag; 
            board[row][col] = w;
            
        }
        return flag;
    }
}
