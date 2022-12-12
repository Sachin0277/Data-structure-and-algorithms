import java.util.Scanner;
import java.util.ArrayList;
public class PrintAllSubsequences {
    //function to print all subsequences of the array
    private static void printAllSubsequences(int i, ArrayList<Integer> res , int arr[],int n){
        if(i == arr.length){
            if(res.size() > 0)
            System.out.println(res);
            return;
        }
        else{
        printAllSubsequences(i+1,res,arr,n);
        res.add(arr[i]);
        printAllSubsequences(i+1,res,arr,n);
        res.remove(res.size()-1);
        
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        printAllSubsequences(0,res,arr,arr.length);
    }
}
