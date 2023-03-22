import java.util.Arrays;

public class NonOverlappingIntervals {

    private static int minWorkerToReschedule(int[][] intervals,int n){
        //sort the intervals on the basis of end time and then 
        int minWorker = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

		int end = intervals[0][1];
		for(int i=1;i<n;i++){
			if(intervals[i][0] < end){
				minWorker++;
			}
			else{
				end = intervals[i][1];
			}
		}
		return minWorker;

    }
    public static void mains(String args[]){
        int[][] intervals = {{1,2},{1,3},{2,3},{3,4}};
        int n = intervals.length;
        int minWorker = minWorkerToReschedule(intervals,n);
        System.out.println(minWorker);
    }
}

