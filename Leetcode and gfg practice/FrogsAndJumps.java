import java.util.HashSet;

public class FrogsAndJumps {

    private static int unvisitedLeaves(int n,int leaves,int[] frogs){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(frogs[i])){
                for(int j=frogs[i];j<=leaves;j+=frogs[i]){
                    set.add(j);
                }
            }
        }
        int count = 0;
        for(int i=1;i<=leaves;i++){
            if(!set.contains(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=3;
        int leaves=4;
        int frogs[] = {3,2,4};
        //call the function
        int ans = unvisitedLeaves(n,leaves,frogs);
        System.out.println(ans);     
    }
}
