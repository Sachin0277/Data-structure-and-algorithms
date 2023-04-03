import java.util.Arrays;
public class BoatsToSavePeople {
    private static int numRescueBoats(int[] people,int limit){
        Arrays.sort(people);
        int l = 0,r = people.length-1;
        int boats = 0;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l++;
                r--;
            } 
            else{
                r--;
            }
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) {
        int people[] = {3,2,2,1};
        int limit = 3;
        int ans = numRescueBoats(people,limit);
        System.out.println(ans);
    }
    
}
