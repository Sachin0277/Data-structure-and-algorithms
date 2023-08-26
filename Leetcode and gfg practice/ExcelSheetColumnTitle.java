public class ExcelSheetColumnTitle {
    
    private static String convertToTitle(int n){
        StringBuilder stringBuilder = new StringBuilder();
        while(n > 0){
            n--;
            stringBuilder.insert(0,(char)('A'+n%26));
            n /= 26;
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        int n = 701;
        System.out.println("The value of the converted title is :");
        System.out.println(convertToTitle(n));
        
    }

}
