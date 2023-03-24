public class RemoveAndReplace {

    private static String removeReverse(String s) 
    { 
        // code here
        
        StringBuffer sb = new StringBuffer(s);
        int freq[] =new int[26];
        for(int i=0;i<sb.length();i++){
            freq[sb.charAt(i)-'a']++;
        }
        int st = 0,end = sb.length()-1;
        int flag = 0;
        while(st <= end){
            if(flag == 0){
                if(freq[sb.charAt(st)-'a'] == 1) st++;
                else{
                    freq[sb.charAt(st)-'a']--;
                    sb.replace(st,st+1,"#");
                    st++;
                    flag = 1;
                }
            }
            else{
                if(freq[sb.charAt(end)-'a'] == 1) end--;
                else{
                    freq[sb.charAt(end)-'a']--;
                    sb.replace(end,end+1,"#");
                    end--;
                    flag = 0;
                }
            }
        }
        if(flag == 1){
            sb.reverse();
        }
        
        
        String ans ="";
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) != '#'){
                ans+=sb.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(removeReverse(s));
    }
}
