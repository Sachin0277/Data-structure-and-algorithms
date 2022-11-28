public class ThirdLargest {
    private static int thirdLargest(int arr[]){
        int firstLargest = arr[0],secondLargest = Integer.MIN_VALUE,thirdLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
                
            }
            else if(arr[i] > thirdLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
        
    }
    
    public static void main(String arg[]){
        int arr[] = new int[]{2 ,6, 7, 4, 9};
        int n = thirdLargest(arr);
        System.out.println("The third largest element in the array: "+n);
    }
    
}
