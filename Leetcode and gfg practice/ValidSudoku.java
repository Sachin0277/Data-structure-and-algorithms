

public class ValidSudoku{
    private static boolean isValid(char board[][],int r,int c,int ch){
        for(int i=0;i<9;i++){
            if(board[i][c] == ch)
                return false;
            if(board[r][c] == ch)
                return false;
            if(board[3*(r/3)+i/3][3*(c/3)+i%3] == ch){
                return false;
            }
        }
        return true;
    }

    private static boolean validSudoku(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    board[i][j] = '.';
                    if(!isValid(board, i, j, ch)){
                        return false;
                    }
                    else{
                        board[i][j] = ch;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        char board[][] =  {
                                    { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                                    { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                                    { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                                    { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                                    { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                                    { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                                    { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                                    { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                                    { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                                                                                  };

        boolean ans = validSudoku(board);
        System.out.println(ans);
    }
    
    
}