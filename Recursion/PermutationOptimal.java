import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class PermutationOptimal {

    private static void findPermutation(int ind,int[] nums, ArrayList<ArrayList<Integer>> ans){
        //base condition
        if(ind == nums.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
        }
        //recursion condition
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            findPermutation(ind+1,nums,ans);
            swap(ind,i,nums);
        }
    }

    //swap function
    private static void swap(int i,int j,int[] nums){
        int temp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //print function to print answer
    private static void printAnswer(ArrayList<ArrayList<Integer>> ans){
        System.out.println(ans);
    }

    //main function
    private static ArrayList<ArrayList<Integer>> permutate(int[] nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findPermutation(0,nums,ans);
        return ans;
    }
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        int n = in.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();

        }
        //data structure to store answer
        ArrayList<ArrayList<Integer>> ans;
        //Creating the function permutation
        ans = permutate(nums);

        //output answer
        printAnswer(ans);
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
