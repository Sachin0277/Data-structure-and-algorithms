import java.util.Scanner;

public class JumpGame{

    //function to find the minimum step to reach end
    private static boolean minStep(int arr[]){
        int step = arr[0];
        for(int i=0;i<arr.length && i <= step;i++){
            step = Math.max(arr[i]+i,step);

        }
        return step >= arr.length-1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{3,2,1,0,4};
        boolean ans = minStep(arr);
        if(ans == true) System.out.println("True");
        else System.out.println("False");
    }
}