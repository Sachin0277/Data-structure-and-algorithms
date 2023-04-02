public class BitInsertion {
    private static int bitInsertion(int x,int y,int a,int b){
        long mask = ((long)1 << (b-a+1))-1;
        mask <<= a;
        x &= ~mask;
        y <<= a;
        x = x|y;
        return x;
    }
    public static void main(String[] args) {
        int x = 1536;
        int y = 7;
        int a = 1;
        int b = 5;
        System.out.println(bitInsertion(x,y,a,b));
    }
}
