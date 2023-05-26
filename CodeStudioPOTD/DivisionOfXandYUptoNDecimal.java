public class DivisionOfXandYUptoNDecimal {

    private static String findDivision(int x,int y,int n){
        StringBuilder sb = new StringBuilder();
        if(n <= 0) return String.valueOf(x/y);
        if(((x > 0) && (y < 0)) || ((x < 0) && (y < 0))){
            sb.append('-');
            x = x > 0 ? x : -x;
            y = y > 0 ? y : -y;
        }
        int d = x/y;
        for(int i = 0;i<=n;i++){
            sb.append(d);
            x = x-(y*d);
            x = x*10;
            d = x/y;
            if(i == 0){
                sb.append('.');
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        int x = 5;
        int y = 4;
        int n = 5;
        System.out.println(findDivision(x,y,n));
    }
}
