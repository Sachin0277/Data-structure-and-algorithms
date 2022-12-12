import java.util.Scanner;
public class ReverseAnArray {
    private static void swap(int i,int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int i,int arr[]){
        if(i >= arr.length/2){
            return;
        }
        swap(i, arr.length-i-1, arr);
        reverse(i+1, arr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(0,arr);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
