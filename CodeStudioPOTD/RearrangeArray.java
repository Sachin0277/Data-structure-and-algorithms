public class RearrangeArray {
    static int arr[];

    /*
     * Method to rearrage the array as arr[arr[i]] without using extra space
     */
    private static void rearrage(int arr[]){
        //first approach using extra space
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = arr[arr[i]];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = res[i];
        }

    }

    /*
     * Method to print the array
     */
    private static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
         arr = new int[] {3,2,0,1};
        //printing the rearranged array
        rearrage(arr);
        printArray(arr);
    }
}
