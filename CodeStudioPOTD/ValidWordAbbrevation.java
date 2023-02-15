public class ValidWordAbbrevation{

    private static boolean isValidAbbrevation(String str, String abbr){
        int len1 = str.length(),len2 = abbr.length();
        int i = 0,j = 0;
        while(i < len1 && j < len2){
            //check if the character of the both string are equal or not 
            if(str.charAt(i) == abbr.charAt(j)){
                i++;j++;
            }
            
            else{
                //check if the string at abbr is greater than '9' or less than '0'
                if(abbr.charAt(j) <= '0' || abbr.charAt(j) > '9')
                    return false;
                else{
                    int cnt = 0;
                    while(j < len2 && Character.isDigit(abbr.charAt(j))){
                        cnt = cnt*10 + (abbr.charAt(j)-'0');
                        j++;
                    }
                    i = i+cnt;
                }
            }
        }
        return i == len1 && j == len2;
    }
    public static void main(String args[]){
        String str = "ninja";
        String abbr = "8inja";

        System.out.println(isValidAbbrevation(str,abbr));

    }
}