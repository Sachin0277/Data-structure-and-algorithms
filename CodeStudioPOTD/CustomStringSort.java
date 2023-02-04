public class CustomStringSort {
    private static String customSort(String x,String y){
        StringBuilder sb = new StringBuilder();
        //create a frequency array for x
        int freq[] = new int[256]; //considering ascii values
        for(int i=0;i<x.length();i++){
            freq[x.charAt(i)]++;
        }
        //now check for each occurence of y in x and consider it in output string
        for(int i=0;i<y.length();i++){
            while(freq[y.charAt(i)]-- > 0){
                sb.append(y.charAt(i));
            }
        }
        //now check for the remaining character and consider it in output string
        for(int i=0;i<x.length();i++){
            if(freq[x.charAt(i)] > 0){
                sb.append(x.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String  x = "acabd";
        String  y = "abc";
        String ans = customSort(x,y);
        System.out.println(ans);
    }
}
