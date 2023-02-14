public class AddBinary {

    private static String addBinary(String s1 , String s2){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len1 = s1.length()-1,len2 = s2.length()-1;
        while(len1 >=0 && len2 >=0){
            int sum = carry;
            if(len2 >=0){
                sum += s2.charAt(len2--)-'0';
            }
            if(len1 >= 0){
                sum += s1.charAt(len1--)-'0';
            }
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        String s1 = "11";
        String s2 = "10";

        String ans = addBinary(s1,s2);
        System.out.println(ans);
    }
}
