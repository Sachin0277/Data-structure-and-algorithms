import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class MaximumDifference {
    //Method to find the maximum difference between any two elements 
    private static String maxDiff(int arr[]){
        int minEle = arr[0];
        int maxEle = arr[0];
        for(int i=0;i<arr.length;i++){
            minEle = Math.min(arr[i],minEle);
            maxEle = Math.max(arr[i],maxEle);
        }
        if((maxEle - minEle) % 2 == 0){
            return "EVEN";
        }
        else{
            return "ODD";
        }
    }
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        // Enter your code here
        System.out.println("Enter the size of the arr:");
        int sizeOfArr = in.nextInt();
        int arr[] = new int[sizeOfArr];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<sizeOfArr;i++){
            arr[i] = in.nextInt();
        }
        //function call
        String ans = maxDiff(arr);
        System.out.println("Output:");
        System.out.println(ans);

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
