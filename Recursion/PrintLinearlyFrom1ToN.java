import java.util.*;
public class PrintLinearlyFrom1ToN {
    //function to print 1 to n linearly
    private static void function(int i,int n){
        if(i > n)
            return;
        System.out.print(i+" ");
        function(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        //call function
        function(1,n);
        
    }
}
