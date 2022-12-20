import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class NQueenProblem {
    private static List<List<String>> solveNQueen(int n){
        List<List<String>> ans = new ArrayList<>();

        return ans;
    }
    private static List<String> construct(char[][] board){
        List<String> ls = new LinkedList<>();
        for(int i=0;i<board.length;i++){
            String str = new String(board[i]);
            ls.add(str);
        }
        return ls;
    }
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        // Write Your Code here
        int n = in.nextInt();
        List<List<String>> res = new ArrayList<>();
        res = solveNQueen(n);
       
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }


    }
}
