import java.util.HashMap;

public class CountSpecialNumbers {
    private static boolean isDivisible(int arr,HashMap<Integer,Integer> map){
        
        for(int i=1;i*i<=arr;i++){
            if(arr%i == 0){
                if(map.containsKey(i) || map.containsKey(arr/i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countSpecialNumbers(int N, int arr[]) {
        // Code here
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<N;i++){
            map.put(arr[i],map.get(arr[i])-1);
            if(map.get(arr[i]) == 0){
                map.remove(arr[i]);
            }
            if(isDivisible(arr[i],map) || map.get(arr[i]) != null){
                cnt++;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {2,3,6};
        System.out.println(countSpecialNumbers(n,arr));
    }
}
