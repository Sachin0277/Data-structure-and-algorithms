public class TracePath{

    private static int isPossible(int n,int m, String s){
        int l = 0,h=0;
        int lmin = 0,hmin = 0,hmax = 0,lmax = 0;
        for(char c : s.toCharArray()){
            if(c == 'L') l--;
            else if(c == 'R') l++;
            else if(c == 'U') h++;
            else h--;

            if(l < lmin) lmin = l;
            if(h < hmin) hmin = h;
            if(h > hmax) hmax = h;
            if(l > lmax) lmax = l;

            if(lmax-lmin >= m) return 0;
            if(hmax - hmin >= n) return 0;

        }
        return 1;
    }
    public static void main(String args[]){
        int n = 2,m=3;
        String s = "LLRU";

        int n1 = 1,m1 = 1;
        String s1 = "R";
        System.out.println(isPossible(n,m,s));
        System.out.println(isPossible(n1, m1, s1));
    }
}