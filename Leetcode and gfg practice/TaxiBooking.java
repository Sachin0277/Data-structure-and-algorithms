public class TaxiBooking {
    private static int minimumTime(int n,int cur,int[] pos,int []time){
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            ans = Math.min(ans,Math.abs(cur-pos[i])*time[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int cur = 4;
        int n = 3;
        int pos[] = {1,5,6};
        int time[] = {2,3,1};

        //call the function
        int ans = minimumTime(n,cur,pos,time);
        System.out.println(ans);
    }
}
