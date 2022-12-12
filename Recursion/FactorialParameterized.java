import java.util.Scanner;
public class FactorialParameterized {
    private static void fact(int i,int f){
        if(i < 1){
        System.out.println(f);
        return;
        }
        fact(i-1,i*f);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        fact(n,1);
    }
}
