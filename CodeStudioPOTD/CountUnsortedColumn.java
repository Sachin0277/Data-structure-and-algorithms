public class CountUnsortedColumn {


    private static int countColumns(String[] strings){
        int l = strings[0].length();
        int n = strings.length;
        int count = 0;
        for(int i=0;i<l;i++){
            for(int j=0;j<n-1;j++){
                if(strings[j].charAt(i)-'a' > strings[j+1].charAt(i)-'a'){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] strings = {"bde","dcf","gat"};
        int ans = countColumns(strings);
        System.out.println(ans); 
    }
}
