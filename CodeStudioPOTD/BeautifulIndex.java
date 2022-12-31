
public class BeautifulIndex{
    private static int beautifulIndex(int a[],int n){
        int ans = -1;
        int suffixSum = 0;
        for(int i:a){
            suffixSum += i;
        }
        int prefixSum = 0;
        for(int i=0;i<n;i++){
            suffixSum -= a[i];
            if(suffixSum == prefixSum){
                ans = i+1;
                break;
            }
            prefixSum += a[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int n = 3;
        int a[] = {2,1,-1};
        int out = beautifulIndex(a,n);
        System.out.println(out);
    }
}