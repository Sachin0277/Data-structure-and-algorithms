public class MinimumRepeatsTomakeASubstringOfB {
    private static int minRepeats(String a, String b){
        int repeats = 1;
        StringBuilder sb = new StringBuilder(a);
        while(sb.length() < b.length()){
            sb.append(a);
            repeats++;
        }
        if(sb.indexOf(b) >= 0) return repeats;
        if(sb.append(a).indexOf(b) >= 0) return repeats+1;
        return -1;
    }
    public static void main(String args[]){
        String a = "abcd";
        String b = "cdabcdab";
        //calling the function which will return the minimum number of repeatition to make string a substring of string b
        int ans = minRepeats(a,b);
        System.out.println(ans);
    }
}
