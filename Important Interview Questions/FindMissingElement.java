/*
Program to find all the missing elements in the given range. we have two inputs:
•  An array of integers
•  The start value and end value of the range
For example, consider the array: arr = {1, 2, 3, 8, 9}. The start value is 1 and the end   value is 5.
This means the range is 1 to 5. Here the missing elements are 4 and 5.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingElement {

    private static ArrayList<Integer> findMissing(int arr[],int start,int end){
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=start;i<=end;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,8,9};
        int start = 1;
        int end = 5;
        ArrayList<Integer> ans = findMissing(arr,start,end);
        //printing ans
        System.out.println(ans);

    }
}
