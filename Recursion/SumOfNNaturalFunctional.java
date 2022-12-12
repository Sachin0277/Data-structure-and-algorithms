import java.util.Scanner;
public class SumOfNNaturalFunctional {
    private static int func(int n){
        if(n == 0) 
            return 0;
        return n + func(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}
