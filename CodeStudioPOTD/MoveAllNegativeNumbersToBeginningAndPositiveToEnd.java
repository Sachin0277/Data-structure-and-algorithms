public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {
 
    private static int[] moveAllNegativeToBeginingAndPositiveToEnd(int[] a){
        //using two pointer approach
        int left = 0,right = a.length-1;
        while(left < right){
            if(a[left] < 0 && a[right] < 0){
                left++;
            }
            else if(a[left] >=0 && a[right] >= 0){
                right--;
            }
            else if(a[left] > 0 && a[right] < 0){
                //swap the element 
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return a;
    }
    public static void main(String args[]){
        int arr[] = {1,-1,2,3,-10,-10,78};
        //expected out -1,-10,-10,1,2,3,78
        int ans[] = moveAllNegativeToBeginingAndPositiveToEnd(arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
    
}
