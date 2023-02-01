public class NumsToWords {
    static String ones[] = { "", "one ", "two ", "three ", "four ",
							"five ", "six ", "seven ", "eight ",
							"nine ", "ten ", "eleven ", "twelve ",
							"thirteen ", "fourteen ", "fifteen ",
							"sixteen ", "seventeen ", "eighteen ",
							"nineteen " };

	
	static String tens[] = { "", "", "twenty ", "thirty ", "forty ",
							"fifty ", "sixty ", "seventy ", "eighty ",
							"ninety " };
	private static String words(int n,String s){
		String str = "";
		if(n > 19){
			str += tens[n/10]+ones[n%10];
		}else{
			str += ones[n];
		}
		if(n!=0){
			str += s;
		}
		return str;
	}

	public static String handleAll(long n) {
		 String ans = "";
		 ans += words((int)(n/10000000),"crore ");
		 ans += words((int)((n/100000)%100),"lakh ");
		 ans += words((int)((n/1000)%100),"thousand ");
		 ans += words((int)((n/100)%10),"hundred ");
		 if(n > 100 && n%100 > 0){
			 ans += "and ";
		 }
		 ans += words((int)(n%100),"");
		 return ans;

	}

    public static void main(String args[]){
        long n = 545432;
        String out = handleAll(n);
        System.out.println(out);
    }
    
}
