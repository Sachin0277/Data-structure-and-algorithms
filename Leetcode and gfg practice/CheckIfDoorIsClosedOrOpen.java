/*
 There are 'N' doors and 'N' people in a house. Each person and door has a unique ID ranging from 1 to 'N'. A person can change the status 
 of the door i.e, if the door is open then a person can close the door and vice versa. Initially, all the doors are closed and each person 
 wants to change the status of all doors whose ID is a multiple of the ID of the person. You need to find out the final status of all the doors.
 The answer should be given in a form of a binary string where 'O' represents the closed door and '1' represents the open door. For example,
 the status "close open close" will form a binary string "010".
 */

import java.util.Scanner;


public class CheckIfDoorIsClosedOrOpen {

    private static boolean isPerfectSquare(int n){
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid*mid == n) return true;
            if(mid*mid < n) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    private static String doorStatus(int num){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=num;i++){
            if(isPerfectSquare(i)){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(n) of doors and people(both are represented by same value of n): ");
        int num = sc.nextInt();
        String ans = doorStatus(num);
        System.out.println(ans);

    }
}
