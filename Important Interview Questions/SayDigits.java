public class SayDigits {

    private static void sayDigit(int n,String arr[]){
        //base case

        if(n == 0){
            return;
        }

        //preprocessing
        int digit = n%10;
        n /= 10;

        //recursive function call
        sayDigit(n, arr);
        

        //print
        System.out.print(arr[digit]+" ");


    }
    public static void main(String args[]){
        int n = 429;
        //create a map of all digits equivalent to its string
        String digitString[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        //call function
        sayDigit(n,digitString);
        

    }
}
