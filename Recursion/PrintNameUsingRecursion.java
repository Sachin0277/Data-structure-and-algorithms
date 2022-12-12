import java.util.*;

public class PrintNameUsingRecursion {
    //Recursion function to print name 'n' times
    private static void printNameUsingRecursion(int i,int n){
        if(i > n)
            return;
        System.out.print("Sachin"+" ");
        printNameUsingRecursion(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to print your name?");
        int n = sc.nextInt();
        printNameUsingRecursion(1,n);

    }
}
