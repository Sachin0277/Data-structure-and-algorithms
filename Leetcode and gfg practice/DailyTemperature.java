import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;
public class DailyTemperature {

    //Method to find the next greater temperature
    private static int[] findDailyTemperature(int[] temperatures){
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }

        return ans;
    }

    //Method to print the result
    private static void printResult(int[] res){
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    //Driver / Main Method
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        // Enter Your Code Here
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int temperatures[] = new int[n];
        System.out.println("Enter the temperatures:");
        for(int i=0;i<n;i++){
            temperatures[i] = in.nextInt();
        }
        //call function that calculate the daily temperature
        int ans[] = new int[n];
        ans = findDailyTemperature(temperatures);
        System.out.print("The result is:"+"\t");
        printResult(ans);
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
