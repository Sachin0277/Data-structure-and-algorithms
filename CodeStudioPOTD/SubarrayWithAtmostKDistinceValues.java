import java.util.HashMap;

public class SubarrayWithAtmostKDistinceValues {
    
    private static int kDistinctSubarrays(int arr[],int k){
        int count = 0;
        int l=0, r=0;
        int size = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(r < arr.length){

            hm.put(arr[r],hm.getOrDefault(arr[r],0)+1);
            if(hm.get(arr[r]) == 1){
                size++;
            }
            while(size > k){
                hm.put(arr[l] , hm.getOrDefault(arr[l],0)-1);
                if(hm.get(arr[l])==0){
                    size--;
                }
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int k = 2;

        //call the function
        int cnt = kDistinctSubarrays(arr,k);
        System.out.println(cnt);
    }
    
}
