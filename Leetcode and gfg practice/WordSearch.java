public class WordSearch {
    //global vis array
    private static boolean vis[][];
    /*
     * implementing dfs to check for all possible ways to check whether it exist or not
     */
    private static boolean dfs(char[][] board,String word,int i,int j, int pos){
        if(pos == word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || word.charAt(pos) != board[i][j] || vis[i][j]){
            return false;
        }
        vis[i][j] = true;
        if(dfs(board,word,i-1,j,pos+1) ||
           dfs(board,word,i+1,j,pos+1) ||
           dfs(board,word,i,j-1,pos+1) ||
           dfs(board,word,i,j+1,pos+1))
           return true;
        vis[i][j] = false;
        return false;
    }
    /*
     * exist fucntion which check that the word exist in the board
     */
    private static boolean exist(char board[][],String word){
        vis = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(word.charAt(0) == board[i][j] && dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";

        if(exist(board,word)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
