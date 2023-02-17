public class NinjaAndEditor{

    private static String editSentence(String str){
        StringBuilder sb = new StringBuilder();
        char s[] = str.toCharArray();
        if(Character.isUpperCase(s[0])){
            sb.append(Character.toLowerCase(s[0]));
        }
        else{
            sb.append(s[0]);
        }
        for(int i=1;i<s.length;i++){
            char cur = s[i];
            if(Character.isUpperCase(cur)){
                cur = Character.toLowerCase(cur);
                sb.append(" ");
            }
            sb.append(cur);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str1 = "CodingNinjasIsACodingPlatform";

        System.out.println(editSentence(str1));
    }
}