public class CapacityToShipPackagesWithinXDays{

    private static int shipWithinDays(int[] weights,int days){
        int left = 0;//maximum weights
        int right = 0; // sum of weights
        //let's find the value of left and right 
        for(int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }
        //apply binary search
        while(left < right){
            int mid = left+(right-left)/2;
            int curWeight = 0;
            int required = 1;
            for(int weight:weights){
                if(curWeight+weight > mid){
                    required+=1;
                    curWeight = 0;
                }
                curWeight += weight;
            }
            if(required > days) left = mid+1;
            else right = mid;
        }
        return left;
    }
    public static void main(String[] args) {
        int []weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}