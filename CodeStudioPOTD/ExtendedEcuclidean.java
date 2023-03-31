public class ExtendedEcuclidean {

    private static int[] extendedGCD(int a,int b){
        int x = 0,y = 1,lx = 1,ly=0,t;
        if(a == b) return new int[]{a,lx,ly};
        while(b!=0){
            int q = a / b;
            int r = a % b;

            a = b;
            b = r;

            t = x;
            x = lx-q*x;
            lx = t;

            t = y;
            y = ly-q*y;
            ly = t;
        }
        return new int[]{a,lx,ly};
    }
    public static void main(String args[]){
        //int a = 4,b=6;
        int a = 17,b=17;
        int ans[] = extendedGCD(a,b);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
