import java.util.Arrays;

public class SegregatePositiveAndNegative {

    private static void mergeMethod(int arr[],int[] aux , int low,int mid,int high){
        int k = low;
        for(int i=low;i<=mid;i++){
            if(arr[i] < 0){
                aux[k++] = arr[i];
            }
        }
        for(int i=mid+1;i<=high;i++){
            if(arr[i] < 0){
                aux[k++] = arr[i];
            }
        }
        for(int i=low;i<=mid;i++){
            if(arr[i] >= 0){
                aux[k++] = arr[i];
            }
        }
        for(int i=mid+1;i<=high;i++){
            if(arr[i] >= 0){
                aux[k++] = arr[i];
            }
        }

        for(int i=low;i<=high;i++){
            arr[i] = aux[i];
        }
    }

    private static void merge(int arr[],int aux[],int low ,int high){

        if(high <= low) return;
        int mid = (low)+(high-low)/2;
        merge(arr,aux,low,mid);
        merge(arr,aux,mid+1,high);
        mergeMethod(arr,aux,low,mid,high);
    }

    public static void main(String args[]){
        int arr[] = {9, -3, 5, -2, -8, -6, 1, 3};

        int newArr[] = Arrays.copyOf(arr, arr.length);

        //call the mergeMethod
        merge(arr,newArr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
