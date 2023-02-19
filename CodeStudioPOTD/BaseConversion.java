public class BaseConversion{

    //function - baseConversion
    private static int baseConversion(String num, int base){
        int ans = 0;
        int b = 1;
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            //String can contains 0-9 and A-F so first convert it to digit
            if(num.charAt(i) >= '0' && num.charAt(i) <= '9'){
                int digit = num.charAt(i)-48;
                if(digit >= base) return -1;
                ans += digit*b;
                b = b*base;
            }
            else if(num.charAt(i) >= 'A' && num.charAt(i) <= 'F'){
                int digit = num.charAt(i) - 55;
                if(digit >= base) return -1;
                ans += digit*b;
                b = b * base;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        //input 
        String num = "10";
        int base = 2;

        //input 2
        String num1 = "20";
        int base1 = 2;

        //output
        System.out.println(baseConversion(num,base));
        System.out.println(baseConversion(num1,base1));

    }
}