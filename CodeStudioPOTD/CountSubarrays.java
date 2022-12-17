import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CountSubarrays {
   
    private static int countSubarrays(int n,int arr[]){
       int cnt1 = 0,cnt0 = 0;
       int num1 = 0,num0 = 0;
       //for elements having value of only ones
       for(int i=0;i<n;i++){
        if(arr[i] == 1) cnt1++;
        else{
            num1 += cnt1*(cnt1+1)/2;
            cnt1 = 0;
        }
       }
       //for elements having value of only zeroes
       for(int i=0;i<n;i++){
        if(arr[i] == 0){
            cnt0++;
        }
        else{
            num0 += cnt0*(cnt0+1)/2;
            cnt0 = 0;
        }
       }
       if(cnt1 > 0) num1 += cnt1*(cnt1+1)/2;
       if(cnt0 > 0) num0 += cnt0*(cnt0+1)/2;
       return num1 + num0;
    }
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        //Put your code here
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value of elements of array (only 0's and 1's):");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans = countSubarrays(n,arr);
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
