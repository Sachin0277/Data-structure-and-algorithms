
import java.util.*;

public class MinimumDeviationInArray {

    // ----- Utility Function ----
    private static int minimumDeviation(int[] arr){
        
        //first of all , read question properly to do second operation we can simply add 2*element if it is odd 
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele : arr){
            if(ele % 2 == 0){
                set.add(ele);
            }
            else{
                set.add(ele*2);
            }
        }
        //In order to find min and max Lets sort the list
        
       
        int dif = set.last()-set.first();
        while(set.last() % 2 == 0){
            int ele = set.last();
            set.remove(ele);
            set.add(ele/2);
            dif = Math.min(dif,set.last()-set.first());
        }
        return dif;
    }
    public static void main (String args[]){

        // ----- Input Management ------
        int arr[] = new int[]{1,2,3,4};
        int arr1[] = new int[]{4,1,5,20,3};

        // ----- Output Management -----
        int ans1 = minimumDeviation( arr);
        int ans2 = minimumDeviation( arr1);

        // ----- Display Management ------
        System.out.println(ans1);
        System.out.println(ans2);


    }
}
