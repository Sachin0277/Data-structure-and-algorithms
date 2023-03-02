public class StringCompression {

    private static int compress(char chars[]){
        int n = chars.length;
        if(n == 1) return 1;
        int i=0,j=0;
        while(i < n){
            int cnt = 1;
            while(i < n-1 && chars[i] == chars[i+1]){
                i++;
                cnt++;
            }
            chars[j++] = chars[i++];
            if(cnt > 1){
                for(char ch : String.valueOf(cnt).toCharArray()){
                    chars[j++] = ch;
                }
            }

        }
        return j;
    }
    public static void main(String[] args) {
        char chars[] = new char[]{'a','a','b','b','c','c','c'};
        int ans = compress(chars);
        System.out.println(ans);
        char chars1[] = new char[]{'a'};
        int ans1 = compress(chars1);
        System.out.println(ans1);
        char chars2[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int ans2 = compress(chars2);
        System.out.println(ans2);
    }
}
