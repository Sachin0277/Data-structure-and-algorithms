public class ConvertSentence {
    private static String convertString(String str){

        //create an array of string for all possible combination for each one of the letter  
        String hm[]= { "2",    "22",  "222", "3",   "33", "333",
						"4",    "44",  "444", "5",   "55", "555",
						"6",    "66",  "666", "7",   "77", "777",
						"7777", "8",   "88",  "888", "9",  "99",
						"999",  "9999" };
		
		String output = "";// string to store in order to get result 
        // Traverse each character of the string and find the respective indexed string in the array of combination string 
        // Add the string to the answer string and return the answer

		for(int i = 0;i<str.length();i++){
			int ind = str.charAt(i) - 'a';
			output = output + hm[ind];
		}
		return output;
    }
    public static void main(String args[]){
        String str = "leetcode";
        System.out.println(convertString(str));
    }
}
