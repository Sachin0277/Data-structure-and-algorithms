

public class NiceArray {
    public static int niceSubarray(int a[], int n){
        // Code Here.
       int desired = 1;
       int cnt = 0;
       int ans = 0;
       for(int i=0;i<n;i++){
            if(cnt > ans){
               ans = cnt;
           }
           if(a[i] == desired){
               desired++;
               cnt++;
               ans = Math.max(ans,cnt);
           }
           else{
               desired = 1;
               cnt = 0;
           }
           
          
       }
       return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,3,1,2,2};
        int a[] = {3,5,2,6};
        int n = a.length;
        int ans = niceSubarray(arr,arr.length);
        System.out.println(ans);
    }
}
