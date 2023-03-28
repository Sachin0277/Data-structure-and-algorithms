import java.util.HashMap;
public class MailingProblem {


    private static int timeTakenToMail(String keyboard,String s){
        HashMap<Character,Integer> map = new HashMap<>();
        //Insert the data into map where each character will be storead as key and value will be its index;
        for(int i=0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i),i);
        }
        int totalTime = 0;
        //first of all the finger should be moved to first character so add this time
        totalTime += map.get(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            totalTime += Math.abs(map.get(s.charAt(i)) - map.get(s.charAt(i+1)));
        }
        return totalTime;
    }
    public static void main(String[] args) {
        String keyboard = "zyxwvutsrqponmlkjihgfedcba";
        String s = "zayb";

        int ans = timeTakenToMail(keyboard, s);
        System.out.println(ans);
    }
}
