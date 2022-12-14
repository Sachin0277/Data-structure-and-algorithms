import java.util.Scanner;
public class MergeSort {

    private static void merge(int arr[],int l,int m,int r){
        int n = arr.length;
        int b[] = new int[r-l+1];
        int i=l,j= m+1,k=l;
        while(l < m && r < r){
            if(arr[i] < arr[j])
                b[k++] = arr[i++];
            else    
                b[k++] = arr[j++];
        }
        while(i < m){
            b[k++] = arr[i++];
        }
        while(j < n){
            b[k++] = arr[j++];
        }
        
        for(int x = 0;x< b.length;x++){
            arr[x++] = b[x];
        }
    }
    private static void mergeSort(int arr[],int l,int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    private static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n);
        printArray(arr);

    }
}
