public class BeautifulIndex1 {

    private static int beautifulIndex(int arr[]){
        int s = 0;
        for(int a: arr) s+= a;
        int lSum = 0;
        for(int i=0;i<arr.length;i++){
            int rSum = s-lSum-arr[i];
            if(lSum == rSum){
                return i+1;
                
            }
            lSum += arr[i];

        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = { 1,1,1};
        int bIndex = beautifulIndex(arr);
        System.out.println(bIndex);

    }
}
