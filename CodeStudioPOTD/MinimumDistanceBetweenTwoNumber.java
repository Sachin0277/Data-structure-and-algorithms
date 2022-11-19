public class MinimumDistanceBetweenTwoNumber {
    /*
     * Method for finding the minimum distance between two number
     */
    private static int minimumDistance(int[] arr,int n,int x,int y){
        int prev = -1,i=0;
        int dmin = Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            if(arr[i] == x || arr[i] == y ){
                if(prev != -1 && arr[i] != arr[prev]){
                dmin = Math.min(dmin,i-prev);
                }
                prev = i;
            }
        }
        if(dmin == Integer.MAX_VALUE)
            return -1;
        return dmin;
    }
    public static void main(String args[]){
        int arr[] = {3,4,5};
        int n = arr.length;
        int x = 3,y=5;
        //calling function to find minimum between two number
        int minDist = minimumDistance(arr,n,x,y);
        System.out.println("Minimum distance between two element is "+minDist);

    }
}
