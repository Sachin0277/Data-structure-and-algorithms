public class SantaClaus {
    private static int[] giftsLeft(int n, int k, int q, int[] demands) {
		int []ans = new int[q];
		int orig = n;
		for(int i=0;i<q;i++){
			if(n >= demands[i]){
				n = n-demands[i];
				if(n >= k){
					ans[i] = n;
				}
				else{
					n = orig;
					ans[i] = n;
				}
			}
			else{
				ans[i] = -1;
			}
		}
		return ans;
	}
    public static void main(String[] args) {
        int n = 7 ;
        int k = 6;
        int q = 2;
        int demands[] = {3,8};
        int ans[] = giftsLeft(n, k, q, demands);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }

    }
}
