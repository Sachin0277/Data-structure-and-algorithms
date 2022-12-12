import java.util.Scanner;
public class CheckIfAStringIsPalindrome {
    private static boolean palin(int i, String s){
        if(i >= (s.length())/2)
            return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
       return palin(i+1,s);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not :");
        String s = sc.nextLine();

        if(palin(0,s))
            System.out.println("Palindrome");
        else 
            System.out.println("Not palindrome");


    }
}
