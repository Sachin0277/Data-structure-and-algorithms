public class MinimumStepsRequired {
    private static int minSteps(String s){
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                count++;
            }
        }
        return (count/2) + 1;
    }
    public static void main(String[] args) {
        String str = "bbaaabb";
        int ans = minSteps(str);
        System.out.println(ans);
    }
}
