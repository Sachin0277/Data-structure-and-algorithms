import java.util.Scanner;
public class PrintInOpposite {
    //function to print from n to 1 using recursion
    private static void func(int i,int n){
        if(i < 1) // base condition
            return;
        System.out.print(i+" ");
        func(i-1,n);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        func(n,n);//calling function
    }
}
