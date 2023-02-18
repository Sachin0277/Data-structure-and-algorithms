public class OneSegement {
    private static boolean oneSegment(String str){
        //here the idea is that in question it is mention that there is no leading zeroes and it is only containing o's and 1's
        int len = str.length();
        for(int i=0;i<len-1;i++){
            if(str.charAt(i) == '0' && str.charAt(i+1) == '1')
                return false;
                
        }
        return true;
    }
    public static void main(String args[]){
        String str = "11100";
        String str1 = "1110011";
        System.out.println(oneSegment(str));
        System.out.println(oneSegment(str1));
    }
}
