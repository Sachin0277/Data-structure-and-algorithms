import java.util.Scanner;

public class CapitalizeFirstCharacter {

    //Method that will capitalize the first character of the given string 
    private static String capitalizeString(String str){
        //creating a stringbuilder object inorder to store the answer
        StringBuilder sb = new StringBuilder();
        //first of all let's get all the words in the given string by using split method
        String[] s = str.split(" ");
        //Now , traverse each word and capitalize the first character using substring method
        for(String ele : s){
            String st = ele.substring(0,1).toUpperCase() + ele.substring(1);
            sb.append(st+" ");
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //calling the function which will capitalize the first character of each word int the given string
        String ans = capitalizeString(str);
        System.out.println(ans);

    }

    
}
