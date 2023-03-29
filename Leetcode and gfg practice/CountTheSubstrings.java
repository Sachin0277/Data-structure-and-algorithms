public class CountTheSubstrings {
    private static int countSubstring(String s){
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            int diff = 0;
            for(int j=i;j<n;j++){
                if(Character.isLowerCase(s.charAt(j))) diff++;
                else diff--;
                if(diff == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "WomensDAY";
        System.out.println(countSubstring(s));
    }
}
