import java.util.Scanner;

public class Print1toNBacktracking {
    private static void func(int i,int n){
        if(i < 1) return;
        func(i-1,n);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        func(n,n);

    }
}
