/*
Problem statement:GFG-POTD(1-19-2023)
There is a carpet of a size a*b [length * breadth]. You are given a box of size c*d. The task is, one has to fit the carpet in the box in a minimum number of moves. 

In one move, you can either decrease the length or the breadth of the carpet by half (floor value of its half).

Note: One can even turn the carpet by 90 degrees any number of times, wont be counted as a move.

 

Example 1:

Input:
A = 8, B = 13
C = 6, D = 10
Output:
Minimum number of moves: 1
Explanation:
Fold the carpet by breadth, 13/2 i.e. 6, 
so now carpet is 6*8 and can fit fine.
 


 */
import java.util.Scanner;
public class CarpetIntoBox {
    private static int carpetIntoBox(int a,int b,int c ,int d){
        if((a <= c && b <= d) || (a <= d && b <= c)) return 0;
        if(a > c && a > d) return 1+carpetIntoBox(a/2, b, c, d);
        if(b > c && b > d) return 1+carpetIntoBox(a, b/2, c, d);
        return Math.min(1+carpetIntoBox(a/2,b,c,d),1+carpetIntoBox(a,b/2,c,d));
     }

     private static int carpet(int a,int b,int c,int d){
        int ans1 = 0,ans2=0,ans3=0,ans4=0;
        int a1 = a,a2 = a,b1=b,b2=b;
        while(a1 > c){
            ans1++;
            a1/=2;
        }
        while(b1 > d){
            ans2++;
            b1/=2;
        }
        while(a2 > d){
            ans3++;
            a2/=2;
        }
        while(b2 > c){
            ans4++;
            b2/=2;
        }
        return Math.min(ans1+ans2,ans3+ans4);

     }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int minNumOfMoves = carpetIntoBox(a,b,c,d);
    System.out.println(carpet(a, b, c, d));
    System.out.println(minNumOfMoves);
   }

    
}
