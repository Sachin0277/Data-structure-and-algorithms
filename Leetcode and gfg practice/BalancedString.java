import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BalancedString {
    private static String balancedString(int n){
        int x = n;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String ans = "";
        while(x >= 26){
            ans += alpha;
            x -= 26;
        }
        if(n % 2 == 0){
            ans += alpha.substring(0,x/2) + alpha.substring(26-(x/2), 26);
        }
        else{
            //finding sum of digit 
            int sum = 0, y = n;
            while(y > 0){
                sum += y % 10;
                y /= 10;
            }
            if(sum % 2 == 0){
                ans += alpha.substring(0, (x+1)/2) + alpha.substring(26-((x-1)/2),26);
            }
            else{
                ans += alpha.substring(0, (x-1)/2) + alpha.substring(26-((x+1)/2), 26);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

       int n = in.nextInt();
       String str = balancedString(n);
       System.out.println(str);
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
