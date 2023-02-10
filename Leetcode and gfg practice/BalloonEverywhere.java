public class BalloonEverywhere {

    private static int maxInstance(String s){
        int len = s.length();
        int cnt = 0;
        int b = 0, a= 0, l = 0,o = 0, n = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == 'b' ) b++;
            if(s.charAt(i) == 'a') a++;
            if(s.charAt(i) == 'l') l++;
            if(s.charAt(i) == 'o' ) o++;
            if(s.charAt(i) == 'n') n++;

            if(b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1){
                cnt++;
                b--;
                a--;
                l-=2;
                o-=2;
                n--;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        String s = "nlaebolko";
        int ans = maxInstance(s);
        System.out.println(ans);
    }
}
