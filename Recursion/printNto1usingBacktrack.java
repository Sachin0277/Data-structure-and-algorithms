import java.util.Scanner;
public class printNto1usingBacktrack {
    private static void func(int i,int n){
        if(i > n)
            return ;
        func(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        func(1,n);
    }
}
