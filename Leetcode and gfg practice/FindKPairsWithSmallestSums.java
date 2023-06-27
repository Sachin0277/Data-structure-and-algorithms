import java.lang.reflect.Array;
import java.util.*;

public class FindKPairsWithSmallestSums {

    private static ArrayList<ArrayList<Integer>> kSmallestPair(int nums1[],int nums2[],int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0) return ans;
        PriorityQueue<int[]> mh = new PriorityQueue<>((a,b) -> (a[0]+a[1]) - (b[0]+b[1]));
        for(int i=0;i<nums1.length && i < k ;i++){
            mh.offer(new int[]{nums1[i],nums2[i],0});
        }
        while(k-- > 0 && !mh.isEmpty()){
            int[] cur = mh.poll();
            int num1 = cur[0];
            int num2 = cur[1];
            int ind = cur[2];
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(num1);
            pair.add(num2);
            ans.add(pair);
            if(ind == nums2.length-1){
                continue;
            }
            mh.offer(new int[]{num1,nums2[ind+1],ind+1});
        }
        return ans;

    }
    public static void main(String args[]){
        int nums1[] ={1,7,11},nums2[] = {2,4,6},k = 3;
        ArrayList<ArrayList<Integer>> ans = kSmallestPair(nums1,nums2,k);
        for(ArrayList<Integer> l : ans){
            System.out.println(l);
        }
    }
}
