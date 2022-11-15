
import java.util.Collections;
import java.util.PriorityQueue;


/*
 * Given an array arr[] of N Numbers. A Perfect Piece is defined as a subarray such that the difference between 
 * the minimum and the maximum value in that range is at most 1. Find the Maximal Length Perfect Piece.
 */
public class LongestPerfectPiece {
    /*
     *Method to determine maximal length Perfect piece 
     */
    private static int longestPerfectPiece(int arr[],int n){
        int res = 0,j=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
            maxHeap.add(arr[i]);
            while(j < n && maxHeap.peek()-minHeap.peek() > 1){
                minHeap.remove(arr[j]);
                maxHeap.remove(arr[j]);
                j++;
            }
            res = Math.max(res,maxHeap.size());
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = new int[]{ 8,8,8,8};
        int n = arr.length;

        int len = longestPerfectPiece(arr,n);
        System.out.println("The longest perfect piece is: "+len);
    }
}

