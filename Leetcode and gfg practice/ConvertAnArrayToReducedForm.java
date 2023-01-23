import java.util.Arrays;
import java.util.HashMap;

public class ConvertAnArrayToReducedForm {
    private static int[] reducedArray(int arr[]){
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int val = 0;
        for(int i=0;i<temp.length;i++){
            hm.put(temp[i],val++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,40,20};
        int ans[] = reducedArray(arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
