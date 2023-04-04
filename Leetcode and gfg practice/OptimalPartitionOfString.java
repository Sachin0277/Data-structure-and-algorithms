import java.util.HashMap;

public class OptimalPartitionOfString {
    private static int partitionString(String s){
        int count = 1,i=0;
        HashMap<Character,Boolean> map = new HashMap<>();
        while(i < s.length()){
            if(map.containsKey(s.charAt(i))){
                count++;
                map.clear();
            }
            map.put(s.charAt(i),true);
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abacaba";
        int ans = partitionString(s);
        System.out.println(ans);
    }
}
