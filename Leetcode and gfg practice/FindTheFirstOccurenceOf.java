public class FindTheFirstOccurenceOf{
    private static int strStr(String haystack, String needle){
        int i=0;
        int j=needle.length();
        while(i < j && i < haystack.length()-needle.length()+1 ){
            String str = haystack.substring(i,j);
            if(str.equals(needle))
             {

                return i;
             }  
            
                i++;
                j++;
           
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }
}