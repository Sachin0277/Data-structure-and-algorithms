public class AppleSubsequences {
    private static int appleSubsequences(int n,int m, String arr){
        //Use two pointer
        int s = 0,e = 0, cntO = 0, ans = 0;
        while(e < n){
            if(arr.charAt(e) == 'O'){
                if(cntO < m){
                    cntO++;
                    e++;
                }
                else{
                    if(arr.charAt(s) == 'O'){
                        cntO--;
                       
                    }
                    s++;
                }
            }
            else{
                e++;
            }
            ans = Math.max(ans,e-s);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        String arr = "AAOAO";
        int ans = appleSubsequences(n,m,arr);
        System.out.println(ans);
    }
}
