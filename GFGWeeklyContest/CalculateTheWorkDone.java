import java.util.Deque;
import java.util.LinkedList;
public class CalculateTheWorkDone {
    public static int workDone(int n, int arr[], int cap){
        // Code Here. 
         Deque<Integer> conveyorBelt = new LinkedList<>();
        int workDone = 0;

        for (int i = 0; i < n; i++) {
            int item = arr[i];
            if (!conveyorBelt.contains(item) ) {
                workDone++;
                conveyorBelt.addFirst(item);
                if (conveyorBelt.size() > cap) {
                    conveyorBelt.removeLast();
                }
            } 
                
           
        }
        return workDone;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,1,4};
        int n = arr.length;
        int cap = 3;
        int ans = workDone(n,arr,cap);
        System.out.println(ans);
    }
}
