
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class DistinctDifference {
    
    private static ArrayList<Integer> distinctDifference(int n,int arr[]){

        //create a set which will store distinct element;
        Set<Integer> set = new HashSet<>();
        //create a left array which will store the number of distinct element to the left of each element
        int left[] = new int[n];
        //create a right array which wil store the number of distinct element to the right of the element
        int right[] = new int[n];

        for(int i=0;i<n;i++){
            left[i] = set.size();
            set.add(arr[i]);
        }
        // inorder to use the same set lets free it
        set.clear();
        
        for(int i=n-1;i>=0;i--){
            right[i] = set.size();
            set.add(arr[i]);
        }
        //create arraylist for output
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(left[i]-right[i]);

        }
        return ans;
    }

    private static void print(ArrayList<Integer> ans){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get((i))+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,3};
        int n = arr.length;
        //calling function which will find the distinct difference
        ArrayList<Integer> ans = distinctDifference(n,arr);
        print(ans);
    }
}
