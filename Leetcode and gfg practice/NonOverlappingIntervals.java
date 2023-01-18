import java.util.Arrays;

public class NonOverlappingIntervals {
    //utility function 
    private static int eraseOverlapIntervals(int[][] intervals){
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int previousEndTime = intervals[0][1];
        int erasedIntervals = 0;
        for(int i=1;i<intervals.length;i++){
            if(previousEndTime > intervals[i][0]){
                erasedIntervals++;
                previousEndTime = Math.min(previousEndTime,intervals[i][1]);
            }
            else{
                previousEndTime = intervals[i][1];
            }
        }
        return erasedIntervals;
    }

    public static void main(String args[]){
        int[][] intervals = {{1,2},{1,2},{1,2}};
        int ans = eraseOverlapIntervals(intervals);
        System.out.println("Minimum number of intervals to be erased to make it non overlapping is :"+ans);
    }
}
