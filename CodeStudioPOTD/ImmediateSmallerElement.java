import java.util.Stack;

/*
 * You are given an integer arr of size 'N'. For each element in the array. check whether the right adjacent 
 * element (on the next immediate position of the array is smaller.) if the next element is smaller,update the
 *  current indext to the current element,if not then -1.
 */
public class ImmediateSmallerElement {
    /*
     * Function to find the immediate smallest
     */
    private static int[] immediateSmaller(int[] arr,int n){
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<n;i++){
            if(!stack.isEmpty()){
                if(arr[i] < stack.peek()){
                    ans[i-1] = arr[i];
                }
                else{
                    ans[i-1] = -1;
                }
            }
            stack.push(arr[i]);
        }
        ans[n-1] = -1;
        return ans;
    }

    /*
     * Function to print the array
     */
    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = { 4, 3, 2, 5, 1 , 0 };
        int n = arr.length;
        //calling to find and replace it with the element smaller next to it or element at the next immediate position
        int res[] = immediateSmaller(arr,n);
        //printing the output array
        printArray(res); 
    }
    
}
