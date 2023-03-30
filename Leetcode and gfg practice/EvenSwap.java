public class EvenSwap {
    private static int[] lexicographicallySmallest(int a[],int n){
        int flag = 0;
        while(true){
            for(int i=0;i<n-1;i++){
                if((a[i]+a[i+1])%2 == 0){
                    if(a[i+1] > a[i]){
                        flag = 1;
                        int t = a[i];
                        a[i] = a[i+1];
                        a[i+1] = t;
                    }
                }
            }
            if(flag==0) break;
            flag = 0;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=3;
        int a[] ={1,3,5};
        int ans[] = lexicographicallySmallest(a,n);
        for(int ele :ans){
            System.out.print(ele + " ");
        }
    }
}
