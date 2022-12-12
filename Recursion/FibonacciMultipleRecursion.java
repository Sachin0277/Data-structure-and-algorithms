import java.util.Scanner;
public class FibonacciMultipleRecursion {
    //function to find the nth fibonacci number
    private static int fib(int n){
        if( n == 0 || n == 1)
            return n;
        int lastFib = fib(n-1);
        int secondLastFib = fib(n-2);
        return lastFib + secondLastFib;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which fibonacci term do you want to know? :");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
