import java.util.ArrayList;

public class InsertIntervals {

    private static ArrayList<ArrayList<Integer>> insertIntervals(ArrayList<ArrayList<Integer>> interval,ArrayList<Integer> newInterval){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> ls : interval){
            if(ls.get(0) > newInterval.get(1)){
                ans.add(newInterval);
                newInterval = ls;
            }
            else if(ls.get(1) >= newInterval.get(0)){
                ArrayList<Integer> temp = new ArrayList<>();
                int min = Math.min(ls.get(0),newInterval.get(0));
                int max = Math.max(ls.get(1),newInterval.get(1));
                temp.add(min);
                temp.add(max);
                newInterval = temp;
            }
            else{
                ans.add(ls);
            }
        }
        ans.add(newInterval);
        return ans;
    }

    private static void print(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> ls : arr){
            System.out.println(ls);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Interval = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);
        Interval.add(new ArrayList<>(a1));
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(7);
        Interval.add(new ArrayList<>(a2));
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(8);
        a3.add(12);
        Interval.add(new ArrayList<>(a3));


        ArrayList<Integer> newInterval = new ArrayList<>();
        newInterval.add( 4);
        newInterval.add( 6);

        //call the function which will insert into the intervals

        ArrayList<ArrayList<Integer>> ans = insertIntervals(Interval,newInterval);
        print(ans);

    }
}
