
import java.util.*;
public class SocialNetworkAnalysis {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] con = new int[n][2];
        for(int i=0;i<m;i++){
            con[i][0] = sc.nextInt();
            con[i][1] = sc.nextInt();
        }
        int numOfUser = 0;
        for(int[] c : con){
            numOfUser = Math.max(numOfUser,Math.max(c[0],c[1]));
        }
        int max = -1;
        int[] count = new int[numOfUser+1];
        for(int[] c : con){
            count[c[0]]++;
            count[c[1]]++;
        }
        for(int i=1;i<count.length;i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        ArrayList<Integer> user = new ArrayList<>();
        for(int i=1;i<count.length;i++){
            if(count[i] == max){
                user.add(i);
            }
        }
        Collections.sort(user);
        for(int u : user){
            System.out.print(u+" ");
        }
        
    }
}
