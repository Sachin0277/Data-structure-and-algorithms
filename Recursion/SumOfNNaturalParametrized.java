
import java.util.Scanner;

public class SumOfNNaturalParametrized {
    private static void sum(int i,int s){
        if(i < 1){
            System.out.println(s);
            return;
        }
        sum(i-1,s+i);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        sum(n,0);
    }
}
