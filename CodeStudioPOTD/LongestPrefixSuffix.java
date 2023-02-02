public class LongestPrefixSuffix {

    private static int longestPreSuf(String str){
        int l = 0;
        int n = str.length();
        int s = (n+1)/2;
        while(s < n){
            if(str.charAt(s) == str.charAt(l)){
                l++;
                s++;
            }
            else{
                s = s-l+1;
                l = 0;
            }
        
        }
        return l;
    }
    public static void main(String []args){
        String str = "ababcdabab";
        //calling the function which will return the longest length of the string which have same prefix and suffix of the string 
        int ans = longestPreSuf(str);
        System.out.println(ans);
    }
}
