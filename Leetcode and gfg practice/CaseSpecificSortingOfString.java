import java.util.Arrays;
public class CaseSpecificSortingOfString{
    private static String caseSort(String s){
        char []chArr = s.toCharArray();
        Arrays.sort(chArr);
        int low = 0,up = 0;
        
        while(low < chArr.length){
            if(chArr[low] >= 'a')
                break;
            low++;
        }
        char res[] = new char[chArr.length];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a'){
                res[i] = chArr[low++];
            }
            else{
                res[i] = chArr[up++];
            }
        }
        return new String(res);

    }
    public static void main(String args[]){
        String s = "defRTSersUXI";
        //calling the method which will return the specififed  sorting of the string
        String ans = caseSort(s);
        System.out.println(ans);
    }
}