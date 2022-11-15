public class ProductArrayPuzzle {
        private static int mod = (int)Math.pow(10,9)+7;
       private static int[] productPuzzle(int arr[]){
        int preProd[] = new int[arr.length];
        preProd[0] = 1;
        for(int i=1;i<arr.length;i++){
            preProd[i] = (arr[i-1]*preProd[i-1]%mod)%mod;
         }
         int sufProd = 1;
         for(int i=arr.length-1;i>=0;i--){
            // sufProd[i] = (arr[i+1] * sufProd[i+1]%mod)%mod;
            preProd[i] = preProd[i]*sufProd;
            sufProd *= arr[i];
         }
        //  int res[] = new int[arr.length];
        //  for(int i=0;i<arr.length;i++){
        //     res[i] = (int)preProd[i]%mod*(int)sufProd[i]%mod;
        //  }
        //  return res;
        return preProd;

       }
       private static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
       public static void main(String[] args) {
        int arr[] = new int[]{1,0,3,4,5,6};
        //Product of array except self
        int res[] = productPuzzle(arr);
        System.out.println("Original array:");
        printArray(arr);
        System.out.println("Product array with product except self");
        printArray(res);
       }
}
