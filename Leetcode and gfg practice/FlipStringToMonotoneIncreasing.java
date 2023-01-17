public class FlipStringToMonotoneIncreasing{
    private static int minimuFlipsMonoIncr(String s){
        //count number of ones
        int flips = 0; 
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') ones++;
            else if(ones > 0){
                flips++;
                ones--;
            }
        }
        return flips;
    }

    public static void main(String args[]){
        String s = "001100000";
        int ans = minimuFlipsMonoIncr(s);
        System.out.println(ans);
    }
}