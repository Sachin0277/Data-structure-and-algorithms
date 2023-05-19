public class MaximumSwap{
    private static int maximumSwap(int n){
        char digits[] = Integer.toString(n).toCharArray();
        int buckets[] = new int[10];
        for(int i=0;i<digits.length;i++){
            buckets[digits[i]-'0']  = i;
        }
        for(int i=0;i<digits.length;i++){
            for(int j=9;j>digits[i]-'0';j--){
                if(buckets[j] > i){
                    char temp = digits[i];
                    digits[i] = digits[buckets[j]];
                    digits[buckets[j]] = temp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }
        return n;
    }
    public static void main(String args[]){
        int n = 9673;
        System.out.println(maximumSwap(n));
    }
}