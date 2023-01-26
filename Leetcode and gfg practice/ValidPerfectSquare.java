import java.util.Scanner;
public class ValidPerfectSquare {
    private static boolean isPerfectSquare(int num){
        //for implementing binay search method we need to modify binay search as
        int low = 1;
        int high = num;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid * mid == num) return true;
            if(mid * mid < num) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean ans = isPerfectSquare(num);//using binary search method
        System.out.println(ans);
    }
}
