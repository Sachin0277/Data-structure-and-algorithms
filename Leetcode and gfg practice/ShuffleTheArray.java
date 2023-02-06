public class ShuffleTheArray {

    //Function which will shuffle the array
    private static int[] shuffle(int nums[], int n){
        //create an array to store result
        int[] res = new int[nums.length];
        int pos = 0;
        for(int xInd = 0, yInd = n;pos < res.length;){
            res[pos++] = nums[xInd++];
            res[pos++] = nums[yInd++];
        }
        return res;

    }

    //function to shuffle the array without using any extra space 
    private static int[] shuffleInPlace(int nums[],int n){
        int sz = nums.length;
        //store the pair of elements in right half of the array
        for(int i=n;i<sz;i++){
            nums[i] = (nums[i]*1024) + (nums[i-n]);
        }

        //to retrieve the values from the pair and replace at desired position
        int pos = 0;
        for(int i=n;i<sz;i++,pos += 2){
            nums[pos] = nums[i]%1024;
            nums[pos+1] = nums[i]/1024;
        }
        return nums;
    }

    //Method that will print the out
    private static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        //input parameters
        int nums[] = {2,5,1,3,4,7};
        int n = 3;

        //output parameter 
        int res[] = shuffle(nums,n);

        int ans[] = shuffleInPlace(nums, n);
    
        //print function call to print output 
        print(res);
        print(ans);


    }
}
